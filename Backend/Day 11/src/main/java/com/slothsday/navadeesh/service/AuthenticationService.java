package com.slothsday.navadeesh.service;

import java.io.IOException;

import com.slothsday.navadeesh.dto.request.ForgotPasswordRequest;
import com.slothsday.navadeesh.dto.request.LoginRequest;
import com.slothsday.navadeesh.dto.request.RegisterRequest;
import com.slothsday.navadeesh.dto.response.ForgotPasswordResponse;
import com.slothsday.navadeesh.dto.response.LoginResponse;
import com.slothsday.navadeesh.dto.response.RegisterResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;

    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);

}
