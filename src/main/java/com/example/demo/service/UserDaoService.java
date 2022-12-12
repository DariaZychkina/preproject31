package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserDaoService {
    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getUsersList();
    public User getById(int id);

}
