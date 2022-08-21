package com.petproject.surveymaker.entity;


import javax.persistence.Table;

@Table(name = "question_types")
public enum QuestionType {
    TEXT,
    CHECKBOX,
    RADIO
}
