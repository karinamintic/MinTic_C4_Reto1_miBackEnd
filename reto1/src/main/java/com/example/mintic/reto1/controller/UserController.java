package com.example.mintic.reto1.controller;

import java.util.List;
import java.util.Optional;

import com.example.mintic.reto1.model.User;
import com.example.mintic.reto1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins ="*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getUsers()
    {
        return userService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody User user)
    {
        userService.save(user);
    }

    @GetMapping("/{email}")
    public boolean emailExists(@PathVariable("email") String email)
    {
        return userService.emailExists(email);
    }

    @GetMapping("/{email}/{password}")
    public Optional<User> userExists(@PathVariable("email") String email, @PathVariable("password") String password)
    {
        return userService.userExists(email, password);
    }

}
