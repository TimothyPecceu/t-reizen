package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduledTimeLocal {
	
	@JsonProperty("DateTime")
	String dateTime;

	public String getDateTime() {
		return dateTime;
	}
	
	
}
