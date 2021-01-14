package com.devdossantos.restapi.controller;

import com.devdossantos.restapi.model.UserModel;
import com.devdossantos.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/api/user/{code}")
    public ResponseEntity consult (@PathVariable("code") Integer code) {

        return userRepository.findById(code)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public UserModel newUser(@RequestBody UserModel user) {
        return userRepository.save(user);
    }
}
