package com.gallery.galleryproject.controller;

import com.gallery.galleryproject.model.Photo;
import com.gallery.galleryproject.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhotoController {

    private PhotoService photoService;

    public PhotoController(PhotoService photoService){
        this.photoService = photoService;
    }

    /**
     * This controller should return FORM for adding photo.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/addPhotoPage", method = RequestMethod.GET)
    public String getPhotoFormPage(Model model) {
        // this will stick empty object with form, so user can populate that object
        // and pass it back to backend
        model.addAttribute("photo", new Photo());
        return "addPhotoPage";
    }

    /**
     * This controller receives request containing photo. Then it calls service to save it.
     *
     * @param photo
     * @return
     */
    @RequestMapping(value = "/photo", method = RequestMethod.POST)
    public String uploadPhoto(@ModelAttribute Photo photo) {

        photoService.savePhoto(photo);

        // after successful "save" return user to the main page
        return "main";
    }
}
