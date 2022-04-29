package com.example.instaplace.domain.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class TagCode {
    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private Long id;

    private String name;

    private String remark;
}
