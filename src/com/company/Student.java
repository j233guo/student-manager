package com.company;

public class Student {
    private String sid;
    private String firstName;
    private String lastName;
    private String age;
    private String address;

    public Student() {
    }

    public Student(String sid, String firstName, String lastName, String age, String address) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
