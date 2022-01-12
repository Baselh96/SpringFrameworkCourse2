package com.springFrameworkCourse2.mockito.mockito;


public class SomeBusinessImpl {

	private DataService dataService;
	
	public SomeBusinessImpl( DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findTheGreatestFromAllData() {
		int greatest = Integer.MIN_VALUE;
		
		//Arrays.stream(dataService.getAllData()).max();
		for(int data : dataService.getAllData()) {
			if(data > greatest) greatest = data;
		}
		
		return greatest;	
	}
	
}
