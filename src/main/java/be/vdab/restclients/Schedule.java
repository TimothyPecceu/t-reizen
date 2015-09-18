package be.vdab.restclients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {
	
	@JsonProperty("TotalJourney")
	TotalJourney totalJourney;
	@JsonProperty("Flight")
	List<Flight> flight;
	
	public TotalJourney getTotalJourney() {
		return totalJourney;
	}

	public void setTotalJourney(TotalJourney totalJourney) {
		this.totalJourney = totalJourney;
	}
	
	public List<Flight> getFlight() {
		return flight;
	}

	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}
	
}
