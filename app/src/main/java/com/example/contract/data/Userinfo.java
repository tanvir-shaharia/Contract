package com.example.contract.data;

public class Userinfo {
    String name,profile,email,phone;

    public Userinfo(String name, String profile, String email, String phone) {
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return profile;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
