package com.example.newProject.basic;


/*
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpI {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithem<Integer> sortAlgorithem;

	public int binarySearch(Integer[] p_numbers, int numberOfSearch) {
		
		// Sortieren des Arrays
		//BubbleSortAlgorithem newaAlgorithem = new BubbleSortAlgorithem();
		Integer[] numbers = sortAlgorithem.sort(p_numbers);
		
		// Suche im Array
		int posiotion = -1;
		int beginner = 0;
		int end = numbers.length;
		while(true) {
			System.out.println("+");
			int newNumber = beginner + ((end-beginner)/2);
			if( numbers[newNumber] == numberOfSearch ) {
				posiotion = newNumber;
				break;
			} else if( beginner == end || beginner == end-1 ) {
				break;
			} else if( numberOfSearch < numbers[newNumber] ) {
				end = newNumber ;
			} else {
				beginner = newNumber;
			}
		}		
		return posiotion;
	}
/*
	
	@PostConstruct
	public void postContruct () {
		logger.info("postConstruct: {}", sortAlgorithem);
	}

	@PreDestroy
	public void preDestroy () {
		logger.info("PreDestroy");
	}
	*/
}
