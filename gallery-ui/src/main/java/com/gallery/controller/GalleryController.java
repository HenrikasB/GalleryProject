package com.gallery.controller;

import com.gallery.model.Photo;
import com.gallery.service.GalleryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class GalleryController {

    private final GalleryService galleryService;

    @GetMapping("/gallery")
    public String getGallery(Model model) {
//    public String returnAllPhotos(Model model) {

//        Photo photo = (Photo) galleryService.getAllPhotos();
//        model.addAttribute("photo", photo);

        /* I NEED HERE TO RECEIVE DATA FROM FORM */

        /*
        *
        * As I understand from photocontroller i sent with POST method data to gallery page, so galleryController needs to accept whole info and pass it to gallery.html
        * but how to accept and how to print the view in html?
        *
        * */

        return "gallery";
    }
}
