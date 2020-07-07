package com.jordan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "surveyresponses")
public class SurveyResponses {

	@Id
	@SequenceGenerator(name="surveyresponses_response_id_seq", allocationSize = 1)
	@GeneratedValue(generator="surveyresponses_response_id_seq", strategy = GenerationType.AUTO)
	@Column(name="response_id")
	private int id;
	
	@Column(name = "answers")
	private String answers;
	
	@OneToOne
	@JoinColumn(name = "survey_id")
	private int surveyid;

	public SurveyResponses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurveyResponses(int id, String answers, int surveyid) {
		super();
		this.id = id;
		this.answers = answers;
		this.surveyid = surveyid;
	}

	@Override
	public String toString() {
		return "SurveyResponses [id=" + id + ", answers=" + answers + ", survey_id=" + surveyid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + id;
		result = prime * result + surveyid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyResponses other = (SurveyResponses) obj;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (id != other.id)
			return false;
		if (surveyid != other.surveyid)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public int getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}
	
	
}
