package com.petproject.surveymaker.controller;

import com.petproject.surveymaker.dto.TestDto;
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

    @GetMapping("/test/{id}")
    public Long test(@PathVariable Long id){
        return id;
    }

    @GetMapping("/get-all")
    public List<Survey> getAll(){
        return surveyService.findAll();
    }


    @PostMapping("/add-survey")
    public String addSurvey(@RequestBody Survey survey){
        return survey.toString();
    }

    @PostMapping("/front-test")
    public TestDto testDto(@RequestBody TestDto testDto){
        testDto.setQuestion(testDto.getQuestion() + " Test");
        testDto.setAnswer(testDto.getAnswer() + " passed");
        testDto.setType(testDto.getType() + " hi from backend xd");

        return testDto;
    }

}
