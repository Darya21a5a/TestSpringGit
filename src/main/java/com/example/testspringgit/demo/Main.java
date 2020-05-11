package com.example.testspringgit.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        Developer bean = context.getBean(DeveloperFactory.class);
        DeveloperFactory developerFactory = new DeveloperFactory(bean);
        developerFactory.writeCode();
    }
}
