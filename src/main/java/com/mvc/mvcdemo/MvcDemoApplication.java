package com.mvc.mvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MvcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcDemoApplication.class, args);
	}

	// @Bean
    // public DispatcherServlet dispatcherServlet() {
    //     return new DispatcherServlet();
    // }

    // @Bean
    // public ServletRegistrationBean dispatcherServletRegistration() {
    //     ServletRegistrationBean registration = new ServletRegistrationBean(
    //             dispatcherServlet(), "/api/");
    //     registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
    //     return registration;
    // }

}
