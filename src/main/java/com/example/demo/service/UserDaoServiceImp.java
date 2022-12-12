package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoServiceImp implements UserDaoService {
    public final UserRepository userRepository;
    @Autowired
    public UserDaoServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getUsersList() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }
}
