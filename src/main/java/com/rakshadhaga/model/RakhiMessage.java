package com.rakshadhaga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class RakhiMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sisterName;
    private String brotherName;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSisterName() {
        return sisterName;
    }

    public void setSisterName(String sisterName) {
        this.sisterName = sisterName;
    }

    public String getBrotherName() {
        return brotherName;
    }

    public void setBrotherName(String brotherName) {
        this.brotherName = brotherName;
    }
}
