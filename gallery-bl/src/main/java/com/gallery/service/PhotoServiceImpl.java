package com.gallery.service;

import com.gallery.model.Photo;
import com.gallery.repositories.PhotoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@CommonsLog
public class PhotoServiceImpl implements PhotoService {

    private final PhotoRepository photoRepository;

//    public ArrayList<Photo> photoList = new ArrayList<Photo>();
//
//    public Photo displayPhotos() {
//        Photo photos = new Photo();
//
//        return photos;
//    }

//    public long generateRandomId() {
//        long random = (long) (Math.random() * 1000 + 1);
//        return random;
//    }

    public Photo save(Photo photo) {

//        try {
//            //
//        } catch (Exception e){
//            //e.printStackTrace();
//            log.error(e);
//
//
//        }

        // for now all photos will have same id
        // this is simulation of saving, later on we will implement logic for actual save
        //System.out.println("Saving photo");
        // photo.setId(generateRandomId());
        // photoList.add(photo);
        //System.out.println(photoList);
        //System.out.println("Photo saved.");

        log.info("Saving photo");

        return photoRepository.save(photo);
    }
}
