package com.gallery.galleryproject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Photo {
    @Getter
    @Setter
    private String name, tag;

    @Getter
    @Setter
    private int quality, id;

}
