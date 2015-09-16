package be.vdab.services;

import be.vdab.restclients.ScheduleResource;

public interface ScheduleService {
	ScheduleResource getVluchten(String vertrek, String bestemming, String datum);
}
