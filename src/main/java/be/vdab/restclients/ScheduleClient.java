package be.vdab.restclients;

public interface ScheduleClient {
	VluchtenSchedule getVluchten(String vertrek, String bestemming, String datum);
}
