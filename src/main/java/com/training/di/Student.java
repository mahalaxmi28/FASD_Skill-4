package com.training.di;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor Injection
    public Student(int studentId, String name, String course, int year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Default Constructor (needed for Setter Injection)
    public Student() {}

    // Setter Injection for course and year
    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

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
