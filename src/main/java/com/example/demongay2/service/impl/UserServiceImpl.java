package com.example.demongay2.service.impl;

import com.example.demongay2.model.User;
import com.example.demongay2.repository.UserRepository;
import com.example.demongay2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    ArrayList<User> UserList = new ArrayList<User>();
    @Autowired
    private UserRepository userRepository ;
    @Override
    public void listUsers() {
        ArrayList<User> UserList = (ArrayList<User>) userRepository.listUsers();
        UserList.sort(Collections.reverseOrder());
    }

    @Override
    public User showUser(String id) {
        return userRepository.getUser(id);
    }
}
