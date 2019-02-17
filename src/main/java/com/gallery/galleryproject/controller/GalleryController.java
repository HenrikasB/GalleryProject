package com.gallery.galleryproject.controller;

import com.gallery.galleryproject.model.Photo;
import com.gallery.galleryproject.service.GalleryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GalleryController {
    // TODO: create get controller that will get list of Objects of type Photo via GalleryService and add them to the gallery.html view

    private GalleryService galleryService;

    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String listOfObjects(Model model) {
        Photo photo = galleryService.getAllPhotos();
        model.addAttribute("photo", photo);
        return "gallery.html";
    }
}
