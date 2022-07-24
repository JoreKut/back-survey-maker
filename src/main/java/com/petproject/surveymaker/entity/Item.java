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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;
    private QuestionType questionType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Options> options;
}
