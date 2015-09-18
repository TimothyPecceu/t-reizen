package be.vdab.restclients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleResource {
	@JsonProperty("Schedule")
	List<Schedule> schedule;

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}
}
