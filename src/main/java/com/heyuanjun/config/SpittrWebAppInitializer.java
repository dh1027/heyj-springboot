package com.heyuanjun.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 加载SpringMVCDispatcherServlet
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 加载根容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    // 加载SpringMVC容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // SpringMVCDispatcherServlet 拦截的请求 /
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }

}