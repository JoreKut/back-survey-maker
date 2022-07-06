package com.petproject.surveymaker.entity;

import lombok.*;

import javax.persistence.*;


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
    private Long id;

    @Column(name = "number_of_passes")
    private Integer numberOfPasses;

    @Column(name = "shared_link")
    private String sharedLink;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

}
