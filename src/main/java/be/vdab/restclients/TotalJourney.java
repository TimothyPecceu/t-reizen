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

	public int getHours() {
		if(duration.contains("H")){
			return Integer.parseInt(duration.substring(duration.indexOf('T') + 1, duration.indexOf('H')));
		}
			return 0;
		}

	public int getMinutes() {
		if(duration.contains("M")){
			if(duration.contains("H")){
				return Integer.parseInt(duration.substring(duration.indexOf('H') + 1, duration.indexOf('M')));
			}else{
				return Integer.parseInt(duration.substring(duration.indexOf('T') + 1, duration.indexOf('M')));
			}
		}
		return 0;
	}

	public int getDays() {
		if (duration.contains("D")) {
			return Integer.parseInt(duration.substring(duration.indexOf('P') + 1, duration.indexOf('D')));
		}
		return 0;
	}
	
	public String getFormattedDuration(){
		StringBuilder builder = new StringBuilder();
		if(getDays() != 0){
			builder.append(getDays()).append(" dag(en), ");
		}
		if(getHours() != 0){
			builder.append(getHours()).append("h ");
		}
		
		if(getMinutes() != 0){
			builder.append(getMinutes());
		}
		return builder.toString();
	}
}
