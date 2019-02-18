package com.gallery.galleryproject.controller;

import com.gallery.galleryproject.model.Photo;
import com.gallery.galleryproject.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhotoController {

    private PhotoService photoService;

    public PhotoController(PhotoService photoService){
        this.photoService = photoService;
    }

    /*NOT SURE ABOUT THIS ONE(1)*/
    /*From this RequestMapping I have to display all information from fields which were filled by user*/

    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    public String displayPhoto(Model model) {
        /*From PhotoService I believe I have to collect all data with .getId and etc*/
        Photo photo = new PhotoService().displayPhotos();
        model.addAttribute("photo", photo);
        return "photo";
    }

    /*NOT SURE ABOUT THIS ONE(2)*/
    /*From this RequestMapping I will send the all collected data from /photo page to value = "/gallery
    * but what methods in PhotoService I need to use? I'm kinda lost with this one,
    * because in GalleryController I'll display everything, so it means that first I have to send something to display
    * ANOTHER QUESTION. What if my gallery is empty? */
    @RequestMapping(value = "/photo", method = RequestMethod.POST)
    public String sendPhoto(Model model) {

        return "gallery.html";
    }
}
