package com.edu.api.service;

import com.edu.api.model.User;
import com.edu.api.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String email) {
        return this.userRepository.findUserByEmail(email);
    }

    public User getUserId(Long id) {
        return this.userRepository.findUserById(id);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAllByOrderByIdDesc();
    }

}


