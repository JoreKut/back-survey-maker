package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SurveyDto implements Serializable {
    private List<ItemDto> items;
}
