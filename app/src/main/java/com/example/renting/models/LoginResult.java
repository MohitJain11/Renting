package com.example.renting.models;

public class LoginResult {
    private String user_name;
    //@SerializedName("email")
    private String user_mobile;

    public String getUser_name() {
        return user_name;
    }

    public String getUser_mobile() {
        return user_mobile;
    }
}
