package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UsuarioController {
    @GetMapping()
    public ResponseEntity<String> getAll(){
        var response = "Bienvenido";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}


