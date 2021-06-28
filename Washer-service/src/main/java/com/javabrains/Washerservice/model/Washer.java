package com.javabrains.Washerservice.model;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@Document(collection = "Washer")
public class Washer {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Double phone_number;
    private Boolean wash_request;
    private String Reviews;
    private Double Ratings;

    public Washer(String id, String name, String email, String password, Double phone_number, Boolean wash_request, String reviews, Double ratings) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.wash_request = wash_request;
        Reviews = reviews;
        Ratings = ratings;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Double phone_number) {
        this.phone_number = phone_number;
    }

    public Boolean getWash_request() {
        return wash_request;
    }

    public void setWash_request(Boolean wash_request) {
        this.wash_request = wash_request;
    }

    public String getReviews() {
        return Reviews;
    }

    public void setReviews(String reviews) {
        Reviews = reviews;
    }

    public Double getRatings() {
        return Ratings;
    }

    public void setRatings(Double ratings) {
        Ratings = ratings;
    }


}
