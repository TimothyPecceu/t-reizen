package be.vdab.restclients;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;

import be.vdab.exceptions.KanVluchtenNietLezenException;

@Component
public class LufthansaScheduleClient implements ScheduleClient {
	
	private final static Logger logger = Logger.getLogger(LufthansaScheduleClient.class.getName());
	private final String uriTemplate;
	private final OAuth2RestTemplate restTemplate;
	
	@Autowired
	public LufthansaScheduleClient(@Value("${lufthansaURL}") String uriTemplate, OAuth2RestTemplate restTemplate) {
		this.uriTemplate = uriTemplate;
		this.restTemplate = restTemplate;
	}
	
	
	
	@Override
	public VluchtenSchedule getVluchten(String vertrek, String bestemming, String datum){
		Map<String, String> parameters = new HashMap<>();
		parameters.put("vertrek", vertrek);
		parameters.put("bestemming", bestemming);
		parameters.put("datum", datum);
		try{
			return restTemplate.getForObject(uriTemplate, VluchtenSchedule.class, parameters);
		}catch(Exception ex){
			logger.log(Level.SEVERE, "kan vluchten niet lezen", ex);
			throw new KanVluchtenNietLezenException();
		}

	}
}
