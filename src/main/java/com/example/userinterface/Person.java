package com.example.userinterface;



public class Person {
    private static int nextId = 1;

    private String id;
    private String firstName;
    private String lastName;
    private String department;
    private String major;
    private String email;



    public Person(String firstName, String lastName, String department, String major, String email) {
        this.id = generateNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.major = major;
        this.email = email;
    }

    private String generateNextId() {
        return String.valueOf(nextId++);
    }
}


