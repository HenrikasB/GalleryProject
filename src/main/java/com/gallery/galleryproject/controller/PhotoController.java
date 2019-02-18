package com.gallery.galleryproject.controller;

import com.gallery.galleryproject.model.Photo;
import com.gallery.galleryproject.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhotoController {

    private PhotoService photoService;

    public PhotoController(PhotoService photoService){
        this.photoService = photoService;
    }

    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    public String displayPhoto(Model model) {
        Photo photo = new PhotoService().displayPhotos();
        model.addAttribute("photoc", photo);
        return "photo";
    }
}
