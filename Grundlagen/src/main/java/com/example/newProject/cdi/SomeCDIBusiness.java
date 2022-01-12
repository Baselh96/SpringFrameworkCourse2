package com.example.newProject.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public int findTheGreatest() {
		int greatest = Integer.MIN_VALUE;
		
		for(int number : someCDIDAO.getData()) {
			if (greatest < number) greatest = number;
		}
		return greatest;
	}
	
}
