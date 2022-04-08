package com.petproject.surveymaker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String id;
    private String nickname;
    private List<Survey> surveyList;
}
