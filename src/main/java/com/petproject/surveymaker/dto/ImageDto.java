package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImageDto implements Serializable {
    private final Long id;
    private final String imgPath;
}
