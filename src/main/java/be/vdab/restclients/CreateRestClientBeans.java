package be.vdab.restclients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;

@Configuration
@PropertySource("classpath:/restClient.properties")
@ComponentScan
public class CreateRestClientBeans {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	ClientCredentialsResourceDetails resourceDetails(){
		ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
		resourceDetails.setId("lufthansa");
		resourceDetails.setClientId("h3b9exzt5b6kewmp3w3k3tpx");
		resourceDetails.setClientSecret("fbbE4pGwFT");
		resourceDetails.setAccessTokenUri("https://api.lufthansa.com/v1/oauth/token");
		return resourceDetails;
	}
	
	@Bean
	DefaultAccessTokenRequest accessTokenRequest(){
		return new DefaultAccessTokenRequest();		
	}
	
	@Bean
	OAuth2ClientContext oAuth2ClientContext(){
		return new DefaultOAuth2ClientContext(accessTokenRequest());
	}
	
	@Bean
	OAuth2RestTemplate restTemplate(){
		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails(),oAuth2ClientContext());
		DefaultOAuth2AccessToken token=(DefaultOAuth2AccessToken)restTemplate.getAccessToken();
		token.setTokenType("Bearer");
		return restTemplate;
	}
}
