package com.nitesh.test.bootstrap;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class CustomWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println(" ********************* ********************* ********************* *********************");
        System.out.println(" ********************* Hey Nitesh, Application is being deployed ***********************");
        System.out.println(" ********************* ********************* ********************* *********************");

        ServletRegistration.Dynamic registration = servletContext.addServlet("experienceDispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(2);
        registration.addMapping("/experience/*");
    }
}
