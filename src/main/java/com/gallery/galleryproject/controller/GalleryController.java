package com.gallery.galleryproject.controller;

import com.gallery.galleryproject.model.Photo;
import com.gallery.galleryproject.service.GalleryService;
import com.gallery.galleryproject.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GalleryController {

    private GalleryService galleryService;

    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }


    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String returnAllPhotos(Model model) {
        /*
        * If I create photo.setId for example Ill see in /gallery page.
        * So this means that with this .getAllPhotos I'll receive later all information from /gallery page
        */
        Photo photo = galleryService.getAllPhotos();
        model.addAttribute("photo", photo);
        return "gallery.html";
    }
}
