package com.infoshareacademy.model;

public class User {

    private String name;
    private String surname;
    private String type;

    public User() {
    }

    public User(String name, String surname, String type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", type='" + type + '\'' + '}';
    }
}
