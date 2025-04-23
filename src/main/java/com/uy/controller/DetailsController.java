package com.uy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/sessionId")
    public String getSessionId(){
        //return request.getSession().getId();
        return request.getRequestedSessionId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(){
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
