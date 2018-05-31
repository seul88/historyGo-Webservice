package com.historygo.controller;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;


@Document(collection = "Users")
public class User {

    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int points;
    private List<Place> places;


    public User() {
        this.places = new ArrayList<>();
    }

    public User(String name, int points, List<Place> places) {
        this.name = name;
        this.points = points;
        this.places = places;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Place> getPlaces() {
        return places;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", points=" + points +
                ", places=" + places +
                '}';
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
