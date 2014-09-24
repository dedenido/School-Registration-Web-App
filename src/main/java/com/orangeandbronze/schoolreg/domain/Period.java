package com.orangeandbronze.schoolreg.domain;

public enum Period {
	AM830("8:30am - 10:00am", "AM830"), 
	AM10("10:00m - 11:30am", "AM10"), 
	AM1130("11:30am - 1:00pm", "AM1130"), 
	PM1("1:00pm - 2:30pm", "PM1"), 
	PM230("2:30pm - 4:00pm", "PM230"), 
	PM4("4:00pm - 5:30pm", "PM4");
	
	private String timePeriod;
	private String abbrev;

	private Period (String timePeriod, String abbrev) {
		this.timePeriod = timePeriod;
		this.abbrev = abbrev;
	}
	
	public String getTimePeriod() {
		return timePeriod;
	}
	
	public String abbrev() {
		return abbrev;
	}
	
}
