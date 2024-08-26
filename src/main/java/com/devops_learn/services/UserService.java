package com.devops_learn.services;

import com.devops_learn.dtos.requests.RegisterUserRequest;
import com.devops_learn.dtos.responses.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse register(RegisterUserRequest registerUserRequest);
}
