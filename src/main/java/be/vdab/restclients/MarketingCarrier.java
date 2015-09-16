package be.vdab.restclients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class MarketingCarrier {
	@XmlElement(name="AirlineID")
	String airlineID;
	@XmlElement(name="FlightNumber")
	String flightNumber;
	public String getAirlineID() {
		return airlineID;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	
	
}
