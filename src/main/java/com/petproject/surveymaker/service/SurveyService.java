package com.petproject.surveymaker.service;

import com.petproject.surveymaker.entity.Survey;

import java.util.List;

public interface SurveyService {
    Survey findSurveyById(Long id);
    void addSurvey(Survey survey);
    List<Survey> getAll();
}
