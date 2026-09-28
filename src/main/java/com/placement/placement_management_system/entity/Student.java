package com.placement.placement_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String hallTicketNumber;

    private String qualification;

    private String course;

    private int yearOfPassing;

    private String certificate;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String hallTicketNumber,
                   String qualification, String course,
                   int yearOfPassing, String certificate) {
        this.name = name;
        this.hallTicketNumber = hallTicketNumber;
        this.qualification = qualification;
        this.course = course;
        this.yearOfPassing = yearOfPassing;
        this.certificate = certificate;
    }

    // Getters and Setters

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

    public String getHallTicketNumber() {
        return hallTicketNumber;
    }

    public void setHallTicketNumber(String hallTicketNumber) {
        this.hallTicketNumber = hallTicketNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}