package com.petproject.surveymaker.repository;

import com.petproject.surveymaker.entity.Survey;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SurveyRepo extends JpaRepository<Survey, Long> {
    @NonNull Optional<Survey> findById(@NonNull Long id);

}
