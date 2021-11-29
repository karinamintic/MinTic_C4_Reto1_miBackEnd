package com.example.mintic.reto1.service;

import java.util.List;
import java.util.Optional;

import com.example.mintic.reto1.model.User;
import com.example.mintic.reto1.repository.crud.UserCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll()
    {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id)
    {
        return userCrudRepository.findById(id);
    }

    public User save(User user)
    {
        return userCrudRepository.save(user);
    }

    public Optional<User> emailExists(String email)
    {
        return userCrudRepository.findByEmail(email);
    }

    public Optional<User> usesExists(String email, String password)
    {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
}
