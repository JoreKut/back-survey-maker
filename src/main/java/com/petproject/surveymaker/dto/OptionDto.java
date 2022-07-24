package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OptionDto implements Serializable {
    private boolean checked;
    private String value;
}
