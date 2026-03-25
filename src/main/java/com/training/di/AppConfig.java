package com.training.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.training.di")
public class AppConfig {

    // Bean with Constructor Injection via Java Config
    @Bean(name = "studentConfig")
    public Student studentFromConfig() {
        // Constructor injection
        Student s = new Student(301, "Kiran Reddy", "B.Tech ECE", 4);
        // Setter injection for course override
        s.setCourse("B.Tech ECE (Hons)");
        return s;
    }
}
