package com.example.newProject.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {
	
	//read from Property file
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}
}
