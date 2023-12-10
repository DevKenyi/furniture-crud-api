package com.kenyi.furniture.controller;

import com.kenyi.furniture.collection.User;
import com.kenyi.furniture.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UseController {
    @Autowired
    private Service service;

    @PostMapping("save-user")
    public String saveUser(@RequestBody User user){
         return service.saveUser(user);
    }


    @GetMapping("users")
    public List<User> userList(){
        return service.getUsers();
    }
}
