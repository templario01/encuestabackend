package com.example.encuestabackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.encuestabackend.entities.UserEntity;
import com.example.encuestabackend.models.requests.UserRegisterRequestModel;
import com.example.encuestabackend.models.requests.UserResponse;
import com.example.encuestabackend.services.IUserService;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping()
    public UserResponse create(@RequestBody @Valid UserRegisterRequestModel userModel) {
        UserEntity user = userService.create(userModel);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(user, userResponse);

        return userResponse;
    }

}
