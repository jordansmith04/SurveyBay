export class response{

    id: number;
    answers: string;
    survey_id: number;

    constructor( input_id: number, input_answers: string, input_survey_id: number){
        this.id = input_id;
        this.answers = input_answers;
        this.survey_id = input_survey_id;
    }
}