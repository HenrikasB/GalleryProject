package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {
    // TODO: create method getAllPhotos() which will create a list of populated photos objects

    public Photo getAllPhotos() {

        Photo photo = new Photo();
        photo.setName("Tree");
        photo.setTag("Nature");
        photo.setQuality(100);

        return photo;

    }
}
