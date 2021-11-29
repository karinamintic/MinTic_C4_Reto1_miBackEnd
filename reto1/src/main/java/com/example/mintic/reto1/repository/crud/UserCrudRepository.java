package com.example.mintic.reto1.repository.crud;

import java.util.Optional;

import com.example.mintic.reto1.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    public Optional<User> findByEmail(String email);
    public Optional<User> findByEmailAndPassword(String email, String password);
}
