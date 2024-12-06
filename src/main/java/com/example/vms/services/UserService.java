package com.example.vms.services;

import com.example.vms.models.User;
import com.example.vms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get All Users
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
