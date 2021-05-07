package com.example.thanveer.safari;

public class User {
    public String phone;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.phone = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

}