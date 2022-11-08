package com.example.encuestabackend.models.requests;

import lombok.Data;

@Data
public class UserResponse {
    private Long id;

    private String name;

    private String email;
}
