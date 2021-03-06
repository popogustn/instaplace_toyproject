package com.example.instaplace.domain.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PlaceList {
    @Id
    @GeneratedValue
    @Column(name = "PLACE_LIST_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLACE_ID")
    @Column(name = "PlACE")
    private Place  placeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    @Column(name = "WRITER")
    private User writer;

}
