package com.example.instaplace.domain.entitiy;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class User {
    @Id
    @Column(name = "USER_ID")
    private String id;

    private String password;

    private String phone;

    private String email;

    private LocalDate birth;

    private LocalDateTime created_ts;

}
