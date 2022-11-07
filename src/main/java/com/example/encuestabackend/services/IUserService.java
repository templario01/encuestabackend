package com.example.encuestabackend.services;

import com.example.encuestabackend.entities.UserEntity;
import com.example.encuestabackend.models.requests.UserRegisterRequestModel;

public interface IUserService {
    public UserEntity create(UserRegisterRequestModel user);
}
