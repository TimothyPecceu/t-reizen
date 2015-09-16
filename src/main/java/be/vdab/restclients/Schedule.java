package be.vdab.restclients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class Schedule {
	
	@XmlElement(name="TotalJourney")
	TotalJourney totalJourney;
	//Flight flight;
	
	public TotalJourney getTotalJourney() {
		return totalJourney;
	}

	public void setTotalJourney(TotalJourney totalJourney) {
		this.totalJourney = totalJourney;
	}
	
	/*public Flight getFlight() {
		return flight;
	}*/
	
	
}
