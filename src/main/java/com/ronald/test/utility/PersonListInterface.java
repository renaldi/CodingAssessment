package com.ronald.test.utility;

import java.util.List;

import com.ronald.test.beans.Person;

public interface PersonListInterface {
	
	public List<Person> getUnsortedPerson(String sourceData);
	
	public List<Person> getSortedPerson(List<Person> persons);
	
	public void printListPerson(List<Person> persons);

}
