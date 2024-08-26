package com.devops_learn.services;

import com.devops_learn.dtos.requests.RegisterUserRequest;
import com.devops_learn.dtos.responses.RegisterUserResponse;
import com.devops_learn.models.User;
import com.devops_learn.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse register(RegisterUserRequest registerUserRequest) {
        User user = User.builder()
                .username(registerUserRequest.getUsername())
                .password(registerUserRequest.getPassword())
                .build();
        userRepository.save(user);

        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setMessage("User registered successfully");
        registerUserResponse.setUserId(user.getUserId());
        return registerUserResponse;
    }
}
