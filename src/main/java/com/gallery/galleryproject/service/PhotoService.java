package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    public Photo displayPhotos() {
        Photo photos = new Photo();

        return photos;
    }

    public void savePhoto(Photo photo) {
        // for now all photos will have same id
        photo.setId(1);

        // this is simulation of saving, later on we will implement logic for actual save
        System.out.println("Saving photo...");
        System.out.println(photo);
        System.out.println("Photo saved.");
    }
}
