package com.example.instaplace.domain.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Comment {
    @Id
    @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long id;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    @Column(name = "WRITER")
    private User writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    @Column(name = "BOARD")
    private Board board;

}
