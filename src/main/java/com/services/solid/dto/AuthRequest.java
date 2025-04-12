package com.services.solid.dto;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;
    private String password;

}
