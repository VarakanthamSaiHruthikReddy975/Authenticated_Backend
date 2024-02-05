package com.unknownkoder.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.unknownkoder.model.ApplicationUser;
import com.unknownkoder.service.AuthenticationService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(){
        return authenticationService.registerUser("", "");
    }
}
