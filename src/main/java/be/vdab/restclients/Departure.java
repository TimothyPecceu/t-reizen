package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Departure {
	
	@JsonProperty("AirportCode")
	String airportCode;
	@JsonProperty("ScheduledTimeLocal")
	ScheduledTimeLocal scheduledTimeLocal;

	public String getAirportCode() {
		return airportCode;
	}

	public ScheduledTimeLocal getScheduledTimeLocal() {
		return scheduledTimeLocal;
	}
	
	
}
