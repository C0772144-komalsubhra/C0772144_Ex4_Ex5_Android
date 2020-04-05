package com.example.c0772144_ex4;

import android.app.Activity;

import java.io.Serializable;

public class ComplaintsModel implements Serializable {
    private String firstName;
    private String lastName;
    private String complaintDescription;
    private String designation;
    private String issueDate;

    public ComplaintsModel(String firstName, String lastName, String complaintDescription, String designation, String issueDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.complaintDescription = complaintDescription;
        this.designation = designation;
        this.issueDate = issueDate;
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

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    @Override
    public String toString() {
        return "Complaint{" +
                "firstName=" + firstName +
                ", secondName='" + lastName + '\'' +
                '}';
    }
}

