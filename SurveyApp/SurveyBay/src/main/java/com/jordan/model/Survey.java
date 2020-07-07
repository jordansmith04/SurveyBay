package com.jordan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="surveys")
public class Survey {

	@Id
	@SequenceGenerator(name="surveys_survey_id_seq", allocationSize = 1)
	@GeneratedValue(generator="surveys_survey_id_seq", strategy = GenerationType.AUTO)
	@Column(name="survey_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	private int coordinator;
	
	@Column(name="surveyname")
	private String surveyname;
	
	@Column(name = "questions")
	private String questions;
	
	@Column(name = "status")
	private String status;

	public Survey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Survey(int id, int coordinator, String surveyname, String questions, String status) {
		super();
		this.id = id;
		this.coordinator = coordinator;
		this.surveyname = surveyname;
		this.questions = questions;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", coordinator=" + coordinator + ", surveyname=" + surveyname + ", questions="
				+ questions + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coordinator;
		result = prime * result + id;
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((surveyname == null) ? 0 : surveyname.hashCode());
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
		Survey other = (Survey) obj;
		if (coordinator != other.coordinator)
			return false;
		if (id != other.id)
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (surveyname == null) {
			if (other.surveyname != null)
				return false;
		} else if (!surveyname.equals(other.surveyname))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(int coordinator) {
		this.coordinator = coordinator;
	}

	public String getSurveyname() {
		return surveyname;
	}

	public void setSurveyname(String surveyname) {
		this.surveyname = surveyname;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}