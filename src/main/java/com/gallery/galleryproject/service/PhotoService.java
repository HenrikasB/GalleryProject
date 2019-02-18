package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    public Photo displayPhotos() {
        Photo photos = new Photo();

        return photos;
    }
}
