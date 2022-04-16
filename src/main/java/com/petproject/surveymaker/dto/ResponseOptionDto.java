package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseOptionDto implements Serializable {
    private final String id;
    private final boolean isRight;
    private final String text;
}
