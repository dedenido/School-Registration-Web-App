package com.orangeandbronze.schoolreg.domain;

public enum Days {
	
	MTH("Monday/Thursday", "MTH"),
	TF("Tuesday/Friday", "TF"),
	WS("Wednesday/Saturday", "WS");
	//MTH, TF, WS
	
	private String dayName;
	private String abbrev;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	private Days (String dayName, String abbrev) {
		this.dayName = dayName;
		this.abbrev = abbrev;
	}
	
	public String getDayName() {
		return dayName;
	}
	
	public String abbrev() {
		return abbrev;
	}
}
