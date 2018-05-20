package com.springtutorial.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model m){
        m.addAttribute("someAttribute","someValue" );
        return "index";
    }
}
