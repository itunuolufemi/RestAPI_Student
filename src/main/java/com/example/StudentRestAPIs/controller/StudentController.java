package com.example.StudentRestAPIs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class StudentController {
    
    @RequestMapping("/name")
    @ResponseBody

    public String getMyName(){

        return "Let's build some beautiful web application!";
    }
}
