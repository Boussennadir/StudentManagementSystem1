package com.example.system;

import java.time.LocalDate;

public class Student {
    private int studentIdd;
    private int year;
    private String firstName;
    private String lastName;
    private String gendre;
    private LocalDate birthday;
    private Double grade;

    public Student(int studentIdd, int year, String firstName, String lastName, String gendre, LocalDate birthday, double grade) {
        this.studentIdd=studentIdd;
        this.year=year;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gendre=gendre;
        this.birthday=birthday;
        this.grade=grade;
    }

    public int getStudentId() {
        return studentIdd;
    }

    public void setStudentId(int studentId) {
        this.studentIdd = studentId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
