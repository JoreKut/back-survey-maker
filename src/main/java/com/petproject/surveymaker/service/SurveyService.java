package com.petproject.surveymaker.service;

import com.petproject.surveymaker.dto.SurveyDto;
import com.petproject.surveymaker.entity.Survey;

import java.util.List;

public interface SurveyService {
    Survey findSurveyById(Long id);
    Survey findSurveyByLink(String link);
    String addSurvey(Survey survey);
    List<Survey> findAll();

    void deleteAll();
}
