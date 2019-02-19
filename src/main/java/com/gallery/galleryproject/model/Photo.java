package com.gallery.galleryproject.model;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
    @Getter
    @Setter
    private String name, tag;

    @Getter
    @Setter
    private int quality, id;

}
