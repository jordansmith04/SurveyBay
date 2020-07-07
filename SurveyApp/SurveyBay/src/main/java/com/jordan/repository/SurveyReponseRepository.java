package com.jordan.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jordan.model.SurveyResponses;

@Repository("surveyResponse")
public interface SurveyReponseRepository {

	List<SurveyResponses> findAllBySurveyid(int surveyid);
	
	SurveyResponses findById(int id);
	
	<S extends SurveyResponses>S save(SurveyResponses surv);
}
