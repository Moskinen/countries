package com.example.countries.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pages {

    @GetMapping("/")
    public String home(){
        return ("home/index");
    }
}
//@GetMapping("/")
//public ModelAndView home(){
//return new ModelAndView ("home/index")