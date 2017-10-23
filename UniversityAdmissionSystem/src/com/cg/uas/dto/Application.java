package com.cg.uas.dto;

import java.util.Date;

public class Application

{

	private int Application_id;
	private String full_name ;
	private Date date_of_birth  ;
	private String highest_qualification ;
	private int marks_obtained  ;
	private String goals ;
	private String email_id  ;
	private int Scheduled_program_id  ;
	private String status  ;
	private Date Date_Of_Interview  ;
	private String address ;
	
	
	public Application() {
	
	}


	public Application(int application_id, String full_name,
			Date date_of_birth, String highest_qualification,
			int marks_obtained, String goals, String email_id,
			int scheduled_program_id, String status, Date date_Of_Interview,
			String address) {
		super();
		Application_id = application_id;
		this.full_name = full_name;
		this.date_of_birth = date_of_birth;
		this.highest_qualification = highest_qualification;
		this.marks_obtained = marks_obtained;
		this.goals = goals;
		this.email_id = email_id;
		Scheduled_program_id = scheduled_program_id;
		this.status = status;
		Date_Of_Interview = date_Of_Interview;
		this.address = address;
	}


	public int getApplication_id() {
		return Application_id;
	}


	public void setApplication_id(int application_id) {
		Application_id = application_id;
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public Date getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public String getHighest_qualification() {
		return highest_qualification;
	}


	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}


	public int getMarks_obtained() {
		return marks_obtained;
	}


	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}


	public String getGoals() {
		return goals;
	}


	public void setGoals(String goals) {
		this.goals = goals;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public int getScheduled_program_id() {
		return Scheduled_program_id;
	}


	public void setScheduled_program_id(int scheduled_program_id) {
		Scheduled_program_id = scheduled_program_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getDate_Of_Interview() {
		return Date_Of_Interview;
	}


	public void setDate_Of_Interview(Date date_Of_Interview) {
		Date_Of_Interview = date_Of_Interview;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Application [Application_id=" + Application_id + ", full_name="
				+ full_name + ", date_of_birth=" + date_of_birth
				+ ", highest_qualification=" + highest_qualification
				+ ", marks_obtained=" + marks_obtained + ", goals=" + goals
				+ ", email_id=" + email_id + ", Scheduled_program_id="
				+ Scheduled_program_id + ", status=" + status
				+ ", Date_Of_Interview=" + Date_Of_Interview + ", address="
				+ address + "]";
	}
	
	
	
	
	
}
