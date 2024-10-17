package com.weekOne.demoWeekOneToFour.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // designates this class as an entity to be mapped to a database table
@Table(name = "students") //  It specifies the name of the table in the database
public class Student {
    @Id // Designates this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates primary key values
    private Long id;

    @Column(nullable = false) // Specifies that this column cannot be of null value
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(length = 100) // Reveals the maximum length for the column
    private String course;

    @Column(unique = true) // Enables for values in the column to be unique
    private String email;

    private String address;

    @Column(name = "phone_number") // Assignes/maps the field to a specific column name
    private String phoneNumber;

    @Column(length = 10) // Specifies the maximum length for the gender column
    private String gender;

    @Column(name = "enrollment_date", nullable = false) // Specifies name of the column and makes its value non-nullable
    private LocalDate enrollmentDate;

    private boolean isActive; // Maps data field to a column to store boolean values


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
