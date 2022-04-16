package com.petproject.surveymaker.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImageDto implements Serializable {
    private final String id;
    private final String imgPath;
}
