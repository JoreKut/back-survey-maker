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
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToMany(mappedBy = "survey")
    private List<Question> questionList = new java.util.ArrayList<>();
    @Column(name = "number_of_passes")
    private Integer number_of_passes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "shared_link", unique = true)
    private String sharedLink;

}
