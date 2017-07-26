package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gabriel on 12/07/17.
 */


@MappedSuperclass
public abstract class User{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    @Temporal(TemporalType.DATE)
    @Column(name="LAST_LOGIN")
    private Date lastLogin;
    @Temporal(TemporalType.DATE)
    private Date created;
    private String photo;
    private String phone;
    private char active;
    private int rating;
    private String name;

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
