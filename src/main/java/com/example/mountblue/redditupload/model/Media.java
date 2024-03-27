package com.example.mountblue.redditupload.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@Entity
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Enumerated(EnumType.STRING)
    private FileType fileType;
    @Lob
    private byte[] mediaData;
    private long fileSize;
    @CreationTimestamp
    private Date uploadDate;
}


//private int id; // Unique identifier for the media record in the database
//private String title;
//private String fileType;
//private byte[] fileData; // Byte array to store the file content as bytea
//private long fileSize;
//private Date uploadDate;