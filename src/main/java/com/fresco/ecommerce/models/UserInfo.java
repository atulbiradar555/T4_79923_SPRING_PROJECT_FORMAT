package com.fresco.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 553630679903565571L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String password;
    private String roles;

    //constructor
    public UserInfo(){

    }

    public UserInfo(String username, String password, String roles){
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public UserInfo(int userId, String username, String password, String roles){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    //getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    @Override
    public String toString() {
        return "UserInfo [" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                ']';
    }

}

