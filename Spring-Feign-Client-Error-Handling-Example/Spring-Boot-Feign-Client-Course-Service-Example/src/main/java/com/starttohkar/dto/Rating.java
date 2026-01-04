package com.starttohkar.dto;

public class Rating {
    private String studentName;
    private int stars; // 1 to 5
    private String comment;

    public Rating() {
    }

    public Rating(String studentName, int stars, String comment) {
        this.studentName = studentName;
        this.stars = stars;
        this.comment = comment;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
