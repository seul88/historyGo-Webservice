package com.historygo.controller;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Places")
public class Place {

    @Id
    String id;
    private String name;
    private String description;
    private int points;
    private double rating;
    private int year;
    private String image;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public Place() {
    }


    public Place(String name, String description, int points) {
        this.name = name;
        this.description = description;
        this.points = points;
    }


    public Place(String name, String description, int points, double rating, int year, String image) {
        this.name = name;
        this.description = description;
        this.points = points;
        this.rating = rating;
        this.year = year;
        this.image = image;
    }


}
