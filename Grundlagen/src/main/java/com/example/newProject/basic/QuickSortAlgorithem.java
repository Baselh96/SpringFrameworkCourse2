package com.example.newProject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithem<T> implements SortAlgorithem<T> {

	@Override
	public T[] sort(T[] array) {
		System.out.println("Quick");
		//Sortieren des Arrays
		return array;
	}

}
