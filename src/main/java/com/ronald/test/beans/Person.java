package com.ronald.test.beans;

public class Person implements Comparable<Object>{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Object o) {
		Person anotherPerson = (Person) o;
		return getName().compareTo(anotherPerson.getName());
	}

}
