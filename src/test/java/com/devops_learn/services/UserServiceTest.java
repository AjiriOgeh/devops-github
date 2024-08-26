package com.devops_learn.services;

import com.devops_learn.dtos.requests.RegisterUserRequest;
import com.devops_learn.dtos.responses.RegisterUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void userRegisterTest() {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setUsername("jim123");
        registerUserRequest.setPassword("password");
        RegisterUserResponse registerUserResponse = userService.register(registerUserRequest);

        assertNotNull(registerUserResponse);
        assertNotNull(registerUserResponse.getUserId());
    }
}