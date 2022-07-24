package com.petproject.surveymaker.service;

import com.petproject.surveymaker.entity.Survey;
import com.petproject.surveymaker.repository.SurveyRepo;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    public Survey findSurveyByLink(String link) {
        return surveyRepo.findSurveyBySharedLink(link).orElse(new Survey());
    }

    @Override
    public String addSurvey(Survey survey) {
        surveyRepo.save(survey);
        String link = "http://79.132.138.108/take-a-survey/";
        try {
            String idHash = hashString(survey.getId().toString());
            survey.setSharedLink(idHash);
            surveyRepo.save(survey);
            link += idHash;
        }catch (NoSuchAlgorithmException exception){
            link += survey.getId().toString();
        }

        return link;
    }

    public String hashString(String input) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] hash = digest.digest(
                input.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    @Override
    public List<Survey> findAll() {
        return surveyRepo.findAll();
    }
    @Override
    public void deleteAll(){
        surveyRepo.deleteAll();
    }
}
