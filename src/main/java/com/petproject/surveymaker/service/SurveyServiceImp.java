package com.petproject.surveymaker.service;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.repository.SurveyRepo;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService{

    private final SurveyRepo surveyRepo;

    public SurveyServiceImp(SurveyRepo surveyRepo){
        this.surveyRepo = surveyRepo;
    }

    @Override
    public Survey findSurveyById(String id) {
        return surveyRepo.findAllById(id);
    }

    @Override
    public void addSurvey(Survey survey) {
        surveyRepo.save(survey);
    }
}
