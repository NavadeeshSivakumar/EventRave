package com.slothsday.navadeesh.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.slothsday.navadeesh.dto.request.RegisterRequest;
import com.slothsday.navadeesh.dto.response.RegisterResponse;
import com.slothsday.navadeesh.model.User;
import com.slothsday.navadeesh.repository.UserRepository;
import com.slothsday.navadeesh.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public RegisterResponse register(RegisterRequest request) {
        Optional<User> isUser = userRepository.findByEmail(request.getEmail());

        if(isUser.isPresent()){
            return RegisterResponse.builder().message("User exists with email" + request.getEmail()).build();
        }

        var user = User.builder().name(request.getName()).email(request.getEmail()).password(request.getPassword()).build();
        userRepository.save(user);

        return RegisterResponse.builder().message("User Registered successfully").build();
    }

    
}