package com.spring.SpringSecurityDemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class WebController {

    @GetMapping("/")
    public String getHome()
    {
        return "<h1> Home Page</>";
    }
    @GetMapping("/user")
    public String getUser()
    {
        return "<h1> hello User</>";
    }

    @GetMapping("/admin")
    public String getAdmin()
    {
        return "<h1> hello Admin</>";
    }


}
