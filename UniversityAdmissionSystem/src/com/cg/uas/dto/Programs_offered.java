package com.cg.uas.dto;


public class Programs_offered 

{

	private String ProgramName	;
	private String description;
	private String applicant_eligibility   ;
	private int duration ;
	private String degree_certificate_offered  ;
	
	
	public Programs_offered() {

	}


	public Programs_offered(String programName, String description,
			String applicant_eligibility, int duration,
			String degree_certificate_offered) {
		super();
		ProgramName = programName;
		this.description = description;
		this.applicant_eligibility = applicant_eligibility;
		this.duration = duration;
		this.degree_certificate_offered = degree_certificate_offered;
	}


	public String getProgramName() {
		return ProgramName;
	}


	public void setProgramName(String programName) {
		ProgramName = programName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getApplicant_eligibility() {
		return applicant_eligibility;
	}


	public void setApplicant_eligibility(String applicant_eligibility) {
		this.applicant_eligibility = applicant_eligibility;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getDegree_certificate_offered() {
		return degree_certificate_offered;
	}


	public void setDegree_certificate_offered(String degree_certificate_offered) {
		this.degree_certificate_offered = degree_certificate_offered;
	}


	@Override
	public String toString() {
		return "Programs_offered [ProgramName=" + ProgramName
				+ ", description=" + description + ", applicant_eligibility="
				+ applicant_eligibility + ", duration=" + duration
				+ ", degree_certificate_offered=" + degree_certificate_offered
				+ "]";
	}
	
	
	
	
	
	
	
}
