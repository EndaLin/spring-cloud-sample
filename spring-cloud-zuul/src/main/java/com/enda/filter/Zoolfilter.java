package com.enda.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: wts
 * @Date: 2019/4/12 9:35
 */
@Component
public class Zoolfilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(Zoolfilter.class);

    /**
     * 配置路由的过滤类型
     * pre 路由之前
     * routing 路由之时
     * post路由之后
     * error 发生错误时调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 配置优先级， 越低优先级越高
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否开启路由
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的具体业务
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info("{}>>{}", request.getMethod(), request.getRequestURI());
        String token = request.getParameter("token");
        if (token == null) {
            logger.warn("token is null");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().setContentType("text/html;charset=utf-8");
                requestContext.getResponse().getWriter().println("身份验证失败");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            logger.info("200 OK");
        }
        return null;
    }


}
