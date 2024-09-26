package com.dvd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController 
{
    @GetMapping("/openpage")
    public String openHello()
    {
        return "index"; // Refers to hello.html in src/main/resources/templates
    }
    
    
    @GetMapping("/Hello")
    public String Hello()
    {
        return "Hello";
    }
   
}
