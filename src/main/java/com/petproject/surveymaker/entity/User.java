package com.petproject.surveymaker.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "username")
    private String username;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Survey> surveyList = new java.util.ArrayList<>();
}
