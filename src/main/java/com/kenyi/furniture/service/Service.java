package com.kenyi.furniture.service;

import com.kenyi.furniture.collection.User;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {
    String saveUser(User user);
    void deleteUser(Long id);
    List<User> getUsers();
    String updateUser();

}
