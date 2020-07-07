package com.jordan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordan.model.Survey;
import com.jordan.repository.SurveyRepository;

@Service("SurveyService")
public class SurveyService {

	@Autowired
	private SurveyRepository sRepo;
	
	public List<Survey> getAllOpenSurvey(){
		return this.sRepo.findAllByStatus("open");
	}
	
	public void saveNewSurvey(Survey survey) {
		this.sRepo.save(survey);
	}
	
	public void updateSurvey(Survey survey) {
		this.sRepo.updateQuestions(survey.getId(), survey.getQuestions());
	}
	
	public List<Survey> getAllClosedSurveys() {
		return this.sRepo.findAllByStatus("closed");
	}
	
	public void closeSurvey(Survey survey) {
		this.sRepo.updateStatus(survey.getId(), survey.getStatus());
	}
}
