package com.training.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {

    public static void main(String[] args) {

        // Load Spring IoC Container from XML configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("=== XML-Based Spring Dependency Injection ===\n");

        // Retrieve Bean - Constructor Injection
        Student s1 = (Student) context.getBean("studentConstructor");
        System.out.println("Constructor Injection:");
        System.out.println(s1);

        System.out.println();

        // Retrieve Bean - Setter Injection
        Student s2 = (Student) context.getBean("studentSetter");
        System.out.println("Setter Injection:");
        System.out.println(s2);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
