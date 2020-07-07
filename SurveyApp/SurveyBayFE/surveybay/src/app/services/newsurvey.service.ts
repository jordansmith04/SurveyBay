import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Survey } from '../models/Survey';

@Injectable({
  providedIn: 'root'
})
export class NewSurveyService {
  private URL:String = 'http://localhost:8080/survey'
  HttpOptions = { headers: new HttpHeaders({'Content-Type':'application/json'})};

  constructor(private client:HttpClient) { }

  save(survey : Survey): void{
    this.client.post<any>(`${this.URL}/new`, `{"surveyid": ${survey.survey_id}, "coordinator": ${survey.coordinator}, "surveyname": "${survey.surveyname}", "questions": "${survey.questions}", "status": "open"}`, this.HttpOptions).subscribe();
  }
}
