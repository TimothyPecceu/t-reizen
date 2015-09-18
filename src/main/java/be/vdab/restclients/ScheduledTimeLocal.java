package be.vdab.restclients;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduledTimeLocal {
	
	@JsonProperty("DateTime")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm")
	Date dateTime;

	public Date getDateTime() {
		return dateTime;
	}	
	
}
