package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PhotoService {

    public Photo displayPhotos() {
        Photo photos = new Photo();

        return photos;
    }

    public int generateRandomId() {
        int random = (int) (Math.random() * 1000 + 1);
        return random;
    }

    public void savePhoto(Photo photo) {
        // for now all photos will have same id
        photo.setId(generateRandomId());

        // this is simulation of saving, later on we will implement logic for actual save
        System.out.println("Saving photo...");
        System.out.println(photo);
        System.out.println("Photo saved.");
    }
}
