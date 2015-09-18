package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight {
	
	@JsonProperty("Departure")
	Departure departure;
	@JsonProperty("Arrival")
	Arrival arrival;
	@JsonProperty("MarketingCarrier")
	MarketingCarrier marketingCarrier;
	
	public Departure getDeparture() {
		return departure;
	}
	
	public Arrival getArrival() {
		return arrival;
	}
	
	public MarketingCarrier getMarketingCarrier() {
		return marketingCarrier;
	}	
	
}
