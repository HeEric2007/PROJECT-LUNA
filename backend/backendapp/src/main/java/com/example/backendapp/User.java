package com.example.backendapp;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private double budget; //change later
    protected User() {}

    public User(String firstName, String lastName, double budget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
