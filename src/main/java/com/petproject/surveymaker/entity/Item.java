package com.petproject.surveymaker.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "questions")
@JsonIgnoreProperties(value = {"id"})
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;
    @Enumerated(EnumType.ORDINAL)
    private QuestionType questionType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Options> options;
}
