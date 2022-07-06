package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QuestionDto implements Serializable {
    private final Long id;
    private final String text;
    private final List<ImageDto> images;
    private final List<ResponseOptionDto> responseOptionList;
}
