package be.vdab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.vdab.restclients.ScheduleClient;
import be.vdab.restclients.ScheduleResource;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	private final ScheduleClient scheduleClient;
	
	@Autowired
	public ScheduleServiceImpl(ScheduleClient scheduleClient) {
		this.scheduleClient = scheduleClient;
	}
	
	@Override
	public ScheduleResource getVluchten(String vertrek, String bestemming, String datum){
		return scheduleClient.getVluchten(vertrek, bestemming, datum);
	}
}
