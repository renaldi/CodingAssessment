package com.ronald.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ronald.test.beans.Person;

public class SorterNamesTest {

	String[] namesToSort;
	String[] sortedNames;

	@Before
	public void initVariables() {
		namesToSort = new String[] { "Orson Milka Iddins", "Erna Dorey Battelle", "Flori Chaunce Franzel",
				"Odetta Sue Kaspar", "Roy Ketti Kopfen", "Madel Bordie Mapplebeck", "Selle Bellison",
				"Leonerd Adda Mitchell Monaghan", "Debra Micheli", "Hailey Annakin", "Leonerd Adda Micheli Monaghan",
				"Avie Annakin" };
		sortedNames = new String[] { "Avie Annakin", "Hailey Annakin", "Erna Dorey Battelle", "Selle Bellison",
				"Flori Chaunce Franzel", "Orson Milka Iddins", "Odetta Sue Kaspar", "Roy Ketti Kopfen",
				"Madel Bordie Mapplebeck", "Debra Micheli", "Leonerd Adda Micheli Monaghan",
				"Leonerd Adda Mitchell Monaghan" };

	}

	@Test
	public void test() {
		List<Person> persons = new ArrayList<Person>();
		for (String name : namesToSort) {
			Person person = new Person();
			person.setName(name);
			persons.add(person);
		}
		PersonListImpl personListImpl = new PersonListImpl();
		personListImpl.getSortedPerson(persons);

		String[] sortedNamesUsingUtility = new String[persons.size()];
		for (int i = 0; i < persons.size(); i++) {
			sortedNamesUsingUtility[i] = persons.get(i).getName();
		}

		assertTrue(Arrays.equals(sortedNames, sortedNamesUsingUtility));
	}

}
