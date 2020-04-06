package com.ufu.simplecrudrest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleCrudRestApp extends SpringBootServletInitializer 
{
    public static void main(String[] args) 
    {
        new SimpleCrudRestApp().configure(new SpringApplicationBuilder(SimpleCrudRestApp.class)).run(args);
    }
}


