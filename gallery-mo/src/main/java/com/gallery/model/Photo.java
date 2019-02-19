package com.gallery.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Photo {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String tag;
    private int quality;

    @Lob
    private byte[] photoData;
}
