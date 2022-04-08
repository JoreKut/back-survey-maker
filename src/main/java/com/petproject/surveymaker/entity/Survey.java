package com.petproject.surveymaker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Survey {
    private String id;
    private List<Question> questionList;
    private Integer passes;
}
