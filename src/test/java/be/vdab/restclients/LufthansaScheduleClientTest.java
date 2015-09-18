package be.vdab.restclients;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
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
	private VluchtenSchedule vluchten;
	
	@Before
	public void before(){
		vluchten=client.getVluchten("BRU", "AEP", "2015-09-24");
	}
	
	/*@Test
	public void vluchtenScheduleNotNull(){
		assertNotNull(vluchten);
	}
	
	@Test
	public void vluchtenScheduleHeeftScheduleResource(){
		assertNotNull(vluchten.getScheduleResource());
	}
	
	@Test
	public void scheduleResourceHeeftEenSchedule(){
		assertNotNull(vluchten.getScheduleResource().getSchedule());
	}

	@Test
	public void eenScheduleHeeftEenTotalJourney() {
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getTotalJourney());
	}*/
	
	/*@Test
	public void totalJourneyHeeftEenDuration(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getTotalJourney().getDuration());
	}*/
	
	/*@Test
	public void eenScheduleHeeftEenFlight(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight());
	}
	
	@Test
	public void eenFlightHeeftEenDeparture(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getDeparture());
	}*/
	
	/*@Test
	public void eenDepartureHeeftEenAirportCode(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getDeparture().getAirportCode());
	}*/
	
	/*@Test
	public void eenDepartureHeeftEenScheduledTimeLocal(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getDeparture().getScheduledTimeLocal());
	}*/
	
	/*@Test
	public void eenDepartureScheduledTimeLocalHeeftEenDateTime(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getDeparture().getScheduledTimeLocal().getDateTime());
	}*/
	
	/*@Test
	public void eenFlightHeeftEenArrival(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getArrival());
	}*/
	
	/*@Test
	public void eenArrivalHeeftEenAirportCode(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getArrival().getAirportCode());
	}*/
	
	/*@Test
	public void eenArrivalHeeftEenScheduledTimeLocal(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getArrival().getScheduledTimeLocal());
	}*/
	
	/*@Test
	public void eenArrivalScheduledTimeLocalHeeftEenDateTime(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getArrival().getScheduledTimeLocal().getDateTime());
	}*/
	
	/*@Test
	public void eenFlightHeeftEenMarketingCarrier(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getMarketingCarrier());
	}*/
	
	/*@Test
	public void eenMarketingCarrierHeeftEenAirlineID(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getMarketingCarrier().getAirlineID());
	}*/
	
	@Test
	public void eenMarketingCarrierHeeftEenFlightNumber(){
		assertNotNull(vluchten.getScheduleResource().getSchedule().get(0).getFlight().get(0).getMarketingCarrier().getFlightNumber());
	}
}
