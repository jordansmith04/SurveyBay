package com.jordan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordan.model.SurveyResponses;
import com.jordan.repository.SurveyReponseRepository;

@Service("surveyResponses")
public class SurveyResponsesService {

	@Autowired
	private SurveyReponseRepository srRepo;
	
	public List<SurveyResponses> findSurveyReponsesById(int surveyid){
		return this.srRepo.findAllBySurveyid(surveyid);
	}
	
	public SurveyResponses findById(int id) {
		return this.srRepo.findById(id);
	}
	
	public void saveSurveyResponses(SurveyResponses surv) {
		this.srRepo.save(surv);
	}

}
