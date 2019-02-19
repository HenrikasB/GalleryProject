package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class PhotoService {
    public ArrayList<Photo> photoList = new ArrayList<Photo>();

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
        // this is simulation of saving, later on we will implement logic for actual save
        System.out.println("Saving photo...");
        photo.setId(generateRandomId());
        photoList.add(photo);
        System.out.println(photoList);
        System.out.println("Photo saved.");
    }
}
