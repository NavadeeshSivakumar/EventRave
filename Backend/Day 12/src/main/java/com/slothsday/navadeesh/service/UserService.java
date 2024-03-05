package com.slothsday.navadeesh.service;


import com.slothsday.navadeesh.dto.request.RegisterRequest;
import com.slothsday.navadeesh.dto.response.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest request);
    
    
}
