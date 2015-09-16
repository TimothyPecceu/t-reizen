package be.vdab.restclients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {
	Departure departure;
	Arrival arrival;
	MarketingCarrier marketingCarrier;
	Details details;
	public Departure getDeparture() {
		return departure;
	}
	public Arrival getArrival() {
		return arrival;
	}
	public MarketingCarrier getMarketingCarrier() {
		return marketingCarrier;
	}
	public Details getDetails() {
		return details;
	}
	
	
}
