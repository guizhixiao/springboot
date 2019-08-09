package com.fly.project.config;

import com.fly.project.interceptor.CustomerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CustomWebMvcConfigSupport extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        System.out.println("=============");
        // excludePathPatterns 直接排除不进入拦截器中
        registry.addInterceptor(new CustomerInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/**");
        super.addInterceptors(registry);
    }
}
