package com.example.instaplace.domain.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class TagRel {
    @Id
    @GeneratedValue
    @Column(name = "TAG_REL_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    @Column(name = "BOARD")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TAG_ID")
    @Column(name = "TAG")
    private TagCode tagCode;
}
