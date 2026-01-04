package com.codefylab.mongodbspringboot.services;

import com.codefylab.mongodbspringboot.domain.User;
import com.codefylab.mongodbspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
