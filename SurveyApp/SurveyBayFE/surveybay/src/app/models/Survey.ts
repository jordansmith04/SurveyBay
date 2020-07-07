import { User } from './Users';

export class Survey{

survey_id : number;
coordinator : string;
surveyname : string;
questions : string;
status : string;

constructor(input_survey_id : number, 
            input_coordinator : string, 
            input_surveyname : string,
            input_questions : string,  
            input_status : string) {

    this.survey_id = input_survey_id;
    this.coordinator = input_coordinator;
    this.surveyname = input_surveyname;
    this.questions = input_questions;
    this.status = input_status;

}

}