package com.gallery.controller;

import com.gallery.model.Photo;
import com.gallery.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class PhotoController {

    private final PhotoService photoService;

    @GetMapping(value = "/addPhotoPage")
    public String getPhotoFormPage(Model model) {
        // this will stick empty object with form, so user can populate that object
        // and pass it back to backend
        model.addAttribute("photo", new Photo());
        return "addPhotoPage";
    }


    @RequestMapping(value = "/photo", method = RequestMethod.POST)
    public String uploadPhoto(@ModelAttribute Photo photo) {
        photoService.save(photo);
        // after successful "save" return user to the main page
        return "main";
    }
}
