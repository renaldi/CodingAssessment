package com.ronald.test.utility;

import java.util.List;

import com.ronald.test.beans.Person;

public class SorterNamesUtility {
	
	private String sourceData; 
	
	public SorterNamesUtility() {
		sourceData = "./unsorted-names-list.txt";
	}
	
	public SorterNamesUtility(String sourceData) {
		this.sourceData = sourceData;
	}
	
	public void SorterPersonName(PersonListInterface personListInterface) {
		List<Person> persons = personListInterface.getUnsortedPerson(this.sourceData);
		personListInterface.getSortedPerson(persons);
		personListInterface.printListPerson(persons);
	}
	
	

}
