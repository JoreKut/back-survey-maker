package com.petproject.surveymaker.entity;


import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "image_path")
    private String imgPath;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private Question question;

}
