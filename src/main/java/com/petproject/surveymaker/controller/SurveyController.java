package com.petproject.surveymaker.controller;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.service.SurveyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/get-survey/{id}")
    public Survey getSurvey(@PathVariable Long id){
        return surveyService.findSurveyById(id);
    }

    @GetMapping("/get-all")
    public List<Survey> getAll(){
        return surveyService.getAll();
    }

    @PostMapping("/add-survey")
    public void addSurvey(@RequestBody Survey survey){
        surveyService.addSurvey(survey);
    }

}
