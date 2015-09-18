package be.vdab.restclients;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class TotalJourneyTest {
	
	TotalJourney journey = new TotalJourney();
	
	@Before
	public void before(){
		journey.setDuration("P1DT19H45M");
	}
	
	@Test
	public void urenGelijkAanIngelezenUren(){
		assertEquals(19, journey.getHours());
	}
	
	@Test
	public void urenGelijkAan0IndienGeenUrenIngelezen(){
		journey.setDuration("PT45M");
		assertEquals(0, journey.getHours());
	}
	
	public void minutenZonderUrenGelijkAanIngelezenMinuten(){
		journey.setDuration("PT45M");
		assertEquals(45, journey.getMinutes());
	}
	
	@Test
	public void minutenMetUrenGelijkAanIngelezenMinuten(){
		assertEquals(45, journey.getMinutes());
	}
	
	@Test
	public void minutenGelijkAan0IndienGeenMinutenIngelezen(){
		journey.setDuration("PT19H");
		assertEquals(0, journey.getMinutes());
	}
	
	@Test
	public void dagenGelijkAanIngelezenDagen(){
		assertEquals(1, journey.getDays());
	}
	
	@Test
	public void dagenGelijkAan0indienGeenDagenIngelezen(){
		journey.setDuration("PT19H45M");
		assertEquals(0, journey.getDays());
	}
	
	@Test
	public void formattedDurationGeeftCorrecteStringTerug(){
		String control = "1 dag(en), 19h 45";
		assertEquals(control, journey.getFormattedDuration());
	}
}
