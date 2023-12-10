package com.kenyi.furniture.service;

import com.kenyi.furniture.collection.User;
import com.kenyi.furniture.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service {
    @Autowired
    private Repo repo;

    @Override
    public String saveUser(User user) {
        try {
            User savedUser = repo.save(user);
            return "User was saved successfully: " + savedUser.getId();
        } catch (Exception e) {
            // Log the exception for debugging purposes
            e.printStackTrace();
            return "There was an issue trying to save User";
        }
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<User> getUsers() {
        return repo.findAll();
    }

    @Override
    public String updateUser() {
        return null;
    }
}
