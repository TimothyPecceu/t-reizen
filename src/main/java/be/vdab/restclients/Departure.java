package be.vdab.restclients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Departure {
	
	@XmlElement(name="AirportCode")
	String airportCode;
	
	ScheduledTimeLocal scheduledTimeLocal;

	public String getAirportCode() {
		return airportCode;
	}

	public ScheduledTimeLocal getScheduledTimeLocal() {
		return scheduledTimeLocal;
	}
	
	
}
