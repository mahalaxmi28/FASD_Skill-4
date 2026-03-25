package com.training.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentAnnotation")
public class StudentAnnotation {

    @Value("201")
    private int studentId;

    @Value("Anjali Verma")
    private String name;

    @Value("B.Sc Data Science")
    private String course;

    @Value("3")
    private int year;

    // Getters
    public int getStudentId() { return studentId; }
    public String getName()    { return name; }
    public String getCourse()  { return course; }
    public int getYear()       { return year; }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + name +
               ", Course=" + course + ", Year=" + year + "]";
    }
}
