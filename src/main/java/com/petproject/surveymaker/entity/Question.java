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
    private Long id;
    @NonNull
    @Column(name = "text")
    private String text;
    @OneToMany(mappedBy = "question")
    private List<Image> images;

    @OneToMany(mappedBy = "question")
    private List<ResponseOption> responseOptionList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "survey_id")
    private Survey survey;

}
