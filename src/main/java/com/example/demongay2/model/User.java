package com.example.demongay2.model;

public class User {
    private String id, age ;
    private String name,hobby;

    public User(){

    }
    public User(String id, String name, String age, String hobby) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }


    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

}
