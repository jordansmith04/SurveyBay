package com.jordan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordan.model.SurveyResponses;
import com.jordan.service.SurveyResponsesService;

@CrossOrigin
@RestController("responseController")
@RequestMapping(path="/response")
public class SurveyResponseController {
	
	@Autowired
	private SurveyResponsesService srServ;

	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveSurveyResponses(@RequestBody SurveyResponses surv) {
		this.srServ.saveSurveyResponses(surv);
	}
	
	@GetMapping(path = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SurveyResponses> findSurveyReponsesById(@PathVariable int id){
		return this.srServ.findSurveyReponsesById(id);
	}
	
	@GetMapping(path = "/one/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SurveyResponses findById(@PathVariable int id) {
		return this.findById(id);
	}
	
	
}
