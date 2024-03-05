package com.slothsday.navadeesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slothsday.navadeesh.dto.request.RegisterRequest;
import com.slothsday.navadeesh.dto.response.RegisterResponse;
import com.slothsday.navadeesh.service.UserService;
import com.slothsday.navadeesh.utils.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(MyConstant.USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(MyConstant.REGISTER)
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        RegisterResponse response = new RegisterResponse();
        try{
            response = userService.register(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
