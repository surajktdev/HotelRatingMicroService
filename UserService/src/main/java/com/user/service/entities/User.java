package com.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "micro_user")
public class User {

    @Id
    private String userId;

    private String name;
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings;
}
