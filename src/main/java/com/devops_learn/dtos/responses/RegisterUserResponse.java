package com.devops_learn.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserResponse {
    private Long userId;
    private String message;
}
