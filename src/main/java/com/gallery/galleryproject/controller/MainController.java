package com.gallery.galleryproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    // TODO: create "get" controller that will load main.html page
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String loadMainPage() {
        return "main.html";
    }
}
