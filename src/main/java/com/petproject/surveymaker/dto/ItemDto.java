package com.petproject.surveymaker.dto;

import com.petproject.surveymaker.entity.QuestionType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ItemDto implements Serializable {
    private String question;
    private QuestionType type;
    private List<OptionDto> options;
}
