package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDto implements Serializable {
    private final String id;
    private final String username;
    private final List<SurveyDto> surveyList;
}
