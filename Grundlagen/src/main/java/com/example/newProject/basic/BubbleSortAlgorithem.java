package com.example.newProject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithem<T> implements SortAlgorithem<T> {
	
	@Override
	public T[] sort(T[] array) {
		System.out.println("Bubble");
		//Sortieren des Arrays
		return array;
	}

}
