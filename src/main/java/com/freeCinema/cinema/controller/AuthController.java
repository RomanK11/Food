package com.freeCinema.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.freeCinema.cinema.model.User;
import com.freeCinema.cinema.service.AuthService;

@Controller
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String authenticate(@RequestParam String username, @RequestParam String password) {
        if (authService.authenticate(username, password)) {
            return "loginSucces";
        } else {
            return "error";
        }
    }

    @ModelAttribute(name = "user")
    public User user() {
        return new User();
    }
}