package com.stackroute.zuulgatewayproxy;

import Filters.ErrorFilter;
import Filters.PostFilter;
import Filters.PreFilter;
import Filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulgatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatewayproxyApplication.class, args);
	}

	@Bean
    public PreFilter preFilter(){
	    return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }














}
