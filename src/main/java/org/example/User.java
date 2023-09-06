package org.example;

import java.time.LocalDate;

public class User {
    private String name;
    private String location;
    private LocalDate startedCodeCoolDate;
    private String email;

    public User(String name, String location, LocalDate startedCodeCoolDate, String email) {
        this.name = name;
        this.location = location;
        this.startedCodeCoolDate = startedCodeCoolDate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getStartedCodeCoolDate() {
        return startedCodeCoolDate;
    }

    public void setStartedCodeCoolDate(LocalDate startedCodeCoolDate) {
        this.startedCodeCoolDate = startedCodeCoolDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", startedCodeCoolDate=" + startedCodeCoolDate +
                ", email='" + email + '\'' +
                '}';
    }
}
