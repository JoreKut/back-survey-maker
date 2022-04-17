package com.petproject.surveymaker.repository;

import com.petproject.surveymaker.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepo extends JpaRepository<Survey, Long> {
    Survey findAllById(Long id);
}
