package com.dailycodebuffer.springsecurityclient.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60)
    private String password;//bicrypt encoder
    private String role;
    private boolean enabled=false; //user is disabled at first, we need to send a link to activate
}
