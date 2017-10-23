package com.cg.uas.dto;

import java.util.Date;

public class Programs_Scheduled

{

	private String Scheduled_program_id ;
	private String ProgramName ;
	private String City  ;
	private int PinCode	 ;
	private Date start_date  ;
	private Date end_date  ;
	private int sessions_per_week ;
	
	
	public Programs_Scheduled() {
		
	}


	public Programs_Scheduled(String scheduled_program_id, String programName,
			String city, int pinCode, Date start_date, Date end_date,
			int sessions_per_week) {
		super();
		Scheduled_program_id = scheduled_program_id;
		ProgramName = programName;
		City = city;
		PinCode = pinCode;
		this.start_date = start_date;
		this.end_date = end_date;
		this.sessions_per_week = sessions_per_week;
	}


	public String getScheduled_program_id() {
		return Scheduled_program_id;
	}


	public void setScheduled_program_id(String scheduled_program_id) {
		Scheduled_program_id = scheduled_program_id;
	}


	public String getProgramName() {
		return ProgramName;
	}


	public void setProgramName(String programName) {
		ProgramName = programName;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public int getPinCode() {
		return PinCode;
	}


	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}


	public Date getStart_date() {
		return start_date;
	}


	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	public Date getEnd_date() {
		return end_date;
	}


	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	public int getSessions_per_week() {
		return sessions_per_week;
	}


	public void setSessions_per_week(int sessions_per_week) {
		this.sessions_per_week = sessions_per_week;
	}


	@Override
	public String toString() {
		return "Programs_Scheduled [Scheduled_program_id="
				+ Scheduled_program_id + ", ProgramName=" + ProgramName
				+ ", City=" + City + ", PinCode=" + PinCode + ", start_date="
				+ start_date + ", end_date=" + end_date
				+ ", sessions_per_week=" + sessions_per_week + "]";
	}
	
	
	
	
	
	
}
