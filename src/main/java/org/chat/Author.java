package org.chat;

public class Author {
    private String name;
    private String surname;
    private double rating;

    public Author(String name, String surname, double rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
