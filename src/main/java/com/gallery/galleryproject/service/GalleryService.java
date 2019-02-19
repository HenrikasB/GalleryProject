package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GalleryService {
    /*Here I can create with setter a new photo in gallery for example, but as I understand I dont need to create it here
     * I need to get the generated information from PhotoService which will be sent by PhotoController*/

    public List<Photo> getAllPhotos() {
        PhotoService photoService = new PhotoService();
        Photo photo = new Photo();
        ArrayList<Photo> photoArray = new ArrayList<Photo>();

        photo.setName("Name");
        photo.setTag("Tag");
        photo.setQuality(100);
        photo.setId(photoService.generateRandomId());
        photoArray.add(photo);
        photo.setName("Name2");
        photo.setTag("Tag2");
        photo.setQuality(1002);
        photo.setId(photoService.generateRandomId());
        photoArray.add(photo);
        return photoArray;
    }
}

