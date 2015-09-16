package be.vdab.restclients;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;

@Component
public class LufthansaScheduleClient implements ScheduleClient {
	private final String uriTemplate;
	private final OAuth2RestTemplate restTemplate;
	
	@Autowired
	public LufthansaScheduleClient(@Value("${lufthansaURL}") String uriTemplate, OAuth2RestTemplate restTemplate) {
		this.uriTemplate = uriTemplate;
		this.restTemplate = restTemplate;
	}
	
	
	
	@Override
	public ScheduleResource getVluchten(String vertrek, String bestemming, String datum){
		Map<String, String> parameters = new HashMap<>();
		parameters.put("vertrek", vertrek);
		parameters.put("bestemming", bestemming);
		parameters.put("datum", datum);
		return restTemplate.getForObject(uriTemplate, ScheduleResource.class, parameters);

	}
}
