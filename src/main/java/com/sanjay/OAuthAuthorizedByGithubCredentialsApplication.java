package com.sanjay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableOAuth2Sso
public class OAuthAuthorizedByGithubCredentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthAuthorizedByGithubCredentialsApplication.class, args);
	}

}
