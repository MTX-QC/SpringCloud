package com.mtx.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 描述：  后置过滤器
 */
@Component
public class PostRequestFilter extends ZuulFilter {

    /**
     * 指定过滤器的列表
     * */
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    /**
     * 指定顺序
     * */
    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER;
    }
    /**
     * 是否过这个过滤器
     * */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体逻辑
     * */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        int status = currentContext.getResponse().getStatus();
        System.out.println("response status:" + status);
        return null;
    }
}
