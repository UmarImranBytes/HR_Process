package com.example.hr_process;

public class Applicant {
    String name;
    String email;
    String address;
    String contact;
    String jobtitle;
    String qualification;
    String date;

    public Applicant() {
    }

    public Applicant(String name, String email, String address, String contact, String jobtitle, String qualification, String date) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.jobtitle = jobtitle;
        this.qualification = qualification;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
