package com.petproject.surveymaker.service;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.repository.SurveyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImp implements SurveyService{

    private final SurveyRepo surveyRepo;

    public SurveyServiceImp(SurveyRepo surveyRepo){
        this.surveyRepo = surveyRepo;
    }

    @Override
    public Survey findSurveyById(Long id) {
        return surveyRepo.findById(id).orElse(new Survey());
    }

    @Override
    public void addSurvey(Survey survey) {
        surveyRepo.save(survey);
    }

    @Override
    public List<Survey> findAll() {
        return surveyRepo.findAll();
    }
}
