package com.example.demongay2.service;

import com.example.demongay2.model.User;

public interface UserService {
    void listUsers();
    User showUser(String id);
}
