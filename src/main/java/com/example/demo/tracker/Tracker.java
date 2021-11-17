package com.example.demo.tracker;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Tracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String status;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date date;

//    @OneToOne(fetch = FetchType.EAGER)
//    @MapsId
//    private String name;

    //working with date
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(nullable = false)
//    private Date lastUpdate;
//
//    @PrePersist
//    private void onCreate() {
//        lastUpdate = new Date();
//    }
//    private String date;

}
