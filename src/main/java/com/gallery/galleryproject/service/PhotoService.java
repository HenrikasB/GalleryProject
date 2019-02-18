package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    public Photo displayPhotos() {
        Photo photo = new Photo();
        photo.setId(9999);
        return photo;
    }
}
