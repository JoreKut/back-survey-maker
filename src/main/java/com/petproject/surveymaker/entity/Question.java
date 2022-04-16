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
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NonNull
    @Column(name = "text")
    private String text;
    @OneToMany(mappedBy = "question")
    private List<Image> images = new java.util.ArrayList<>();
    @NonNull
    @OneToMany(mappedBy = "question")
    private List<ResponseOption> responseOptionList = new java.util.ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "survey_id")
    private Survey survey;

}
