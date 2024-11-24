package com.ms.GATEWAYSERVER;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
       return builder.routes()
      .route("EMP-SERVICE", r->r.path("/EMP-SERVICE/**").uri("lb://EMP-SERVICE")) 
      .route("ACCT-SERVICE", r->r.path("/ACCT-SERVICE/**").uri("lb://ACCT-SERVICE")) //dynamic routing
      .route("PROJECT-SERVICE", r->r.path("/PROJECT-SERVICE/**").uri("lb://PROJECT-SERVICE")) //dynamic routing
      .build();
    }
	
	
	
}
