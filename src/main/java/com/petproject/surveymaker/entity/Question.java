package com.petproject.surveymaker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_question")
    private String id;
    @NonNull
    @Column(name = "text")
    private String text;
    @OneToMany
    private List<Image> images;
    @NonNull
    @OneToMany
    private List<ResponseOption> responseOptionList;
}
