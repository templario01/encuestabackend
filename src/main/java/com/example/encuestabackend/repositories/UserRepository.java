package com.example.encuestabackend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.encuestabackend.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{}
