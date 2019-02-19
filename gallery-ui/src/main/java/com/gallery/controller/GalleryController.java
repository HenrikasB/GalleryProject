package com.gallery.controller;

import com.gallery.model.Photo;
import com.gallery.service.GalleryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class GalleryController {

    private final GalleryService galleryService;

    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String returnAllPhotos(Model model) {
        Photo photo = (Photo) galleryService.getAllPhotos();
        model.addAttribute("photo", photo);
        return "gallery";
    }
}
