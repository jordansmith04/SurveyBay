package com.jordan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordan.model.Survey;
import com.jordan.service.SurveyService;

@CrossOrigin
@RestController("Controller")
@RequestMapping(path="/survey")
public class SurveyController {
	
	@Autowired
	private SurveyService sServ;
	

	@GetMapping(path = "/AllOpen", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Survey>> getAllOpenSurvey(){
		List<Survey> openList = this.sServ.getAllOpenSurvey();
		return new ResponseEntity<>(openList, HttpStatus.OK);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveNewSurvey(@RequestBody Survey survey) {
		this.sServ.saveNewSurvey(survey);
	}
	
	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateSurvey(@RequestBody Survey survey) {
		this.sServ.updateSurvey(survey);
	}
	
	@GetMapping(path = "/allClosed", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Survey>> getAllClosedSurveys(){
		List<Survey> closedList = this.sServ.getAllClosedSurveys();
		return new ResponseEntity<>(closedList, HttpStatus.OK);
	}
	
	@PostMapping(path = "/close", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void closeSurvey(@RequestBody Survey survey) {
		this.sServ.closeSurvey(survey);
	}
}
