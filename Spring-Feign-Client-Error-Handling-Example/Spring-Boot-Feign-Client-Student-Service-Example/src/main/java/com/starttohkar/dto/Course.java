package com.starttohkar.dto;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private String instructor;
    private List<Rating> ratings = new ArrayList<>();

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        return ratings.stream().mapToInt(Rating::getStars).average().orElse(0);
    }

    public Course() {
    }

    public Course(Integer id, String name, String instructor, List<Rating> ratings) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.ratings = ratings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
