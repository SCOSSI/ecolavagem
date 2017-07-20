package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "localization")
public class Localization {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Double latitude;
    private Double longitude;

    public Localization(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
