package com.gallery.galleryproject.service;

import com.gallery.galleryproject.model.Photo;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {
/*Here I can create with setter a new photo in gallery for example, but as I understand I dont need to create it here
* I need to get the generated information from PhotoService which will be sent by PhotoController*/
    public Photo getAllPhotos() {
        Photo photo = new Photo();
        photo.setId(999);
        photo.setName("Test");
        photo.setTag("testTag");
        photo.setQuality(100);
        return photo;
    }
}
