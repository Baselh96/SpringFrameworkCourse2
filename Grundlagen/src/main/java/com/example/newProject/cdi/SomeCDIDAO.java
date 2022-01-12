package com.example.newProject.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {
	
	public int[] getData() {
		return new int[] {1, 20, 40};
	}

}
