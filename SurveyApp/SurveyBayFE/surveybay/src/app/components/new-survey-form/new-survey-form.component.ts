import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { NewSurveyService } from '../../services/newsurvey.service';
import { Survey } from '../../models/Survey';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-survey-form',
  templateUrl: './new-survey-form.component.html',
  styleUrls: ['./new-survey-form.component.css']
})
export class NewSurveyFormComponent implements OnInit {

  survey : Survey; 
  userid : string;
  message:boolean;
  errorMessage:boolean;

  surveyFG = new FormGroup({
    surveyname: new FormControl('', Validators.required),
    questions: new FormControl('', Validators.required)
  });

  constructor(
    private NewSurveyService : NewSurveyService,
    private router:Router
  ) { }

  ngOnInit(): void {
    let checker = sessionStorage.getItem('Role');
    if(!checker){
      this.router.navigate(['']);
    }
    this.userid = sessionStorage.getItem("id"); 
  }
  
  public isHidden = true;

  //submit survey method
  submitSurvey(){
    this.survey = new Survey(     0,
                                  this.userid,
                                  this.surveyFG.get('surveyname').value, 
                                  this.surveyFG.get('questions').value,
                                  "open"
          );

    this.NewSurveyService.save(this.survey).subscribe(result => {
        this.message = true;
        setTimeout(() =>
        {
          this.router.navigate(['home']);
        },
        3000);
    },
    error => {
      this.errorMessage = true;
    });
  }
}
