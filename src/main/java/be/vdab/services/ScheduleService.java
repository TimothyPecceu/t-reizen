package be.vdab.services;

import be.vdab.restclients.ScheduleResource;
import be.vdab.restclients.VluchtenSchedule;

public interface ScheduleService {
	VluchtenSchedule getVluchten(String vertrek, String bestemming, String datum);
}
