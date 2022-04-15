package com.petproject.surveymaker.controller;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.service.SurveyService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/get_survey/{id}")
    public Survey getSurvey(@PathVariable String id){
        return surveyService.findSurveyById(id);
    }

    @PostMapping("/add_surveey")
    public void addSurvey(@RequestBody Survey survey){

    }

}
