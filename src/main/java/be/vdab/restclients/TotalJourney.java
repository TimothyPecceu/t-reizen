package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalJourney {
	
	@JsonProperty("Duration")
	String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
