package be.vdab.restclients;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  CreateRestClientBeans.class)
public class LufthansaScheduleClientTest {
	
	@Autowired
	private LufthansaScheduleClient client;
	
	@Test
	public void scheduleResourceHeeftEenTotalJourneyDuration() {
		ScheduleResource resource=client.getVluchten("BRU", "AEP", "2015-09-17");
		assertNotNull(resource.getSchedule().getTotalJourney().getDuration());
	}

}
