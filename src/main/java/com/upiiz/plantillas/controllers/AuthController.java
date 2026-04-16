package com.upiiz.plantillas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {
    //http://localhost:8080/auth/login
    //http://localhost:8080/auth/register


    //De las plantillas buscar la carpeta css, js y plugins
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/forgot")
    public String forgot() {return "forgot-password"; }


}
