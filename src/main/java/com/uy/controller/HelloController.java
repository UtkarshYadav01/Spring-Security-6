package com.uy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> greet(){
        //String str=" Welcome to Spring Security 6";
        return ResponseEntity.ok("Bulk Upload started successfully");
    }
}
