package com.dvd.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController 
{

    @GetMapping("/showDates")
    public String showDates(Model model) 
    {
    	List<String> asList = Arrays.asList("smith","scott","ward","miller","jon","hendry");
    	model.addAttribute("names", asList);
        model.addAttribute("showDates", LocalDate.now().toString());
        return "Hello"; 
    }
}













