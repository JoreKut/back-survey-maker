package com.petproject.surveymaker.service;

import com.petproject.surveymaker.entity.Survey;

public interface SurveyService {
    Survey findSurveyById(String id);
    void addSurvey(Survey survey);
}
