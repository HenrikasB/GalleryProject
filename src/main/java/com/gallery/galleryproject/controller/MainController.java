package com.gallery.galleryproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    // TODO: create "get" controller that will load main.html page
    @RequestMapping("")
    public String loadMainPage(){
        return "main.html";
    }
}
