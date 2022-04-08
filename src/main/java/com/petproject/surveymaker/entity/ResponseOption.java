package com.petproject.surveymaker.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseOption {
    private String id;
    private boolean isTrue;
    private String text;
}
