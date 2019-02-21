package com.gallery.service;

import com.gallery.model.Photo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GalleryService {


    public List<Photo> getAllPhotos() {

//        PhotoService photoService = new PhotoService();
//        Photo photo = new Photo();
        ArrayList<Photo> photoArray = new ArrayList<Photo>();
//
//        photo.setName("Name");
//        photo.setTag("Tag");
//        photo.setQuality(100);
//        //photo.setId(photoService.generateRandomId());
////        to list
//        photoArray.add(photo);
//
//        photo.setName("Name2");
//        photo.setTag("Tag2");
//        photo.setQuality(1002);
//        //photo.setId(photoService.generateRandomId());
////        to list
//        photoArray.add(photo);


        /*Why everything works with almost empty code here? :D*/
        return photoArray;
    }
}

