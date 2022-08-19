package com.example.demongay2.controller;

import com.example.demongay2.model.User;
import com.example.demongay2.repository.UserRepository;
import com.example.demongay2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    @Autowired
    private UserRepository userRepository;
    private UserService userService;
    @RequestMapping(value = {"/","index"} , method = RequestMethod.GET)
    public String index(Model model){
        List<User> a = userRepository.listUsers();
        model.addAttribute("users", a);
        return "index";
    }
    @GetMapping(value = {"/{id}"})
    @ResponseBody
    public User returnJson(@PathVariable String id){
        return userService.showUser(id);
    }
}
