package com.training.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {

    public static void main(String[] args) {

        // Load Spring IoC Container from Java Annotation configuration
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("=== Annotation-Based Spring Dependency Injection ===\n");

        // Retrieve Bean - @Component with @Value (Annotation Injection)
        StudentAnnotation sa = context.getBean("studentAnnotation", StudentAnnotation.class);
        System.out.println("@Component + @Value Injection:");
        System.out.println(sa);

        System.out.println();

        // Retrieve Bean - @Bean in @Configuration (Java Config Injection)
        Student sc = context.getBean("studentConfig", Student.class);
        System.out.println("@Bean (Constructor + Setter) Injection:");
        System.out.println(sc);

        context.close();
    }
}
