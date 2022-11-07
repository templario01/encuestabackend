package com.example.encuestabackend.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.encuestabackend.entities.UserEntity;
import com.example.encuestabackend.models.requests.UserRegisterRequestModel;
import com.example.encuestabackend.repositories.UserRepository;

@Service
public class UserService implements IUserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity create(UserRegisterRequestModel user) {
        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);
        userEntity.setEncryptedPassword(user.getPassword());

        return userRepository.save(userEntity);
    }

}
