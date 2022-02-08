package com.webApplication;

public class UserValidationService {

	public boolean isUserValide( String username, String passwort) {
		return username.equalsIgnoreCase("Basel") && passwort.equalsIgnoreCase("Basel123");
	}
}
