package com.gallery.galleryproject.model;

import lombok.Getter;
import lombok.Setter;

public class Photo {
    // TODO: create class with all required fields, except actual photo
    @Getter
    @Setter
    private String name, tag;

    @Getter
    @Setter
    private int quality, id;
}
