package be.vdab.restclients;

public interface ScheduleClient {
	ScheduleResource getVluchten(String vertrek, String bestemming, String datum);
}
