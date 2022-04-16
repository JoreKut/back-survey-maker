package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SurveyDto implements Serializable {
    private final String id;
    private final List<QuestionDto> questionList;
    private final Integer number_of_passes;
}
