package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketingCarrier {
	
	@JsonProperty("AirlineID")
	String airlineID;
	
	@JsonProperty("FlightNumber")
	String flightNumber;
	
	public String getAirlineID() {
		return airlineID;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
}
