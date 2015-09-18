package be.vdab.restclients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VluchtenSchedule {
	@JsonProperty("ScheduleResource")
	ScheduleResource scheduleResource;

	public ScheduleResource getScheduleResource() {
		return scheduleResource;
	}

	public void setScheduleResource(ScheduleResource scheduleResource) {
		this.scheduleResource = scheduleResource;
	}
	
}
