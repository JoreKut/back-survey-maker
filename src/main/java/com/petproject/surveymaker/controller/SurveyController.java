package com.petproject.surveymaker.controller;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.service.SurveyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/get-survey/{id}")
    public Survey getSurvey(@PathVariable Long id){
        return surveyService.findSurveyById(id);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/take-a-survey/{link}")
    public Survey getSurvey(@PathVariable String link){
        return surveyService.findSurveyByLink(link);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/get-all")
    public List<Survey> getAll(){
        return surveyService.findAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/del")
    public void deleteAll(){
        surveyService.deleteAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/add-survey")
    public String addSurvey(@RequestBody  Survey survey){

        String link = this.surveyService.addSurvey(survey);
        return link;
    }
}
