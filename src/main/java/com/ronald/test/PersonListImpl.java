package com.ronald.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ronald.test.beans.Person;
import com.ronald.test.utility.PersonListInterface;

public class PersonListImpl implements PersonListInterface{

	public List<Person> getUnsortedPerson(String sourceData) {
		List<Person> listPerson = new ArrayList<Person>();
		BufferedReader in = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(sourceData);
			in = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
			String line; //$NON-NLS-1$
			while ((line = in.readLine()) != null) {
				Person person = new Person();
				line = line.trim().replaceAll("\\s+"," ");
				person.setName(line);
				listPerson.add(person);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				//DO nothing
			}
		} // end try catch
		return listPerson;
	}

	public List<Person> getSortedPerson(List<Person> persons) {
		Collections.sort(persons, new Comparator<Person>() {

			public int compare(Person firstPerson, Person secondPerson) {
				int lastIndexSpace1 = firstPerson.getName().lastIndexOf(" ");				
				String lastNameFirstPrsn;
				String givenNameFirstPrsn;
				
				if(lastIndexSpace1 > 0) {
					lastNameFirstPrsn = firstPerson.getName().substring(lastIndexSpace1+1);
					givenNameFirstPrsn = firstPerson.getName().substring(0, lastIndexSpace1);
				}else {
					lastNameFirstPrsn = firstPerson.getName();
					givenNameFirstPrsn = firstPerson.getName();					
				}
				
				int lastIndexSpace2 = secondPerson.getName().lastIndexOf(" ");
				String lastNameScndPrsn;
				String givenNameScndPrsn;
				
				if(lastIndexSpace2 > 0) {
					lastNameScndPrsn = secondPerson.getName().substring(lastIndexSpace2+1);
					givenNameScndPrsn = secondPerson.getName().substring(0, lastIndexSpace2);
				}else {
					lastNameScndPrsn = secondPerson.getName();
					givenNameScndPrsn = secondPerson.getName();					
				}
				
				int result = lastNameFirstPrsn.compareTo(lastNameScndPrsn);
				if(result == 0) {
					result = givenNameFirstPrsn.compareTo(givenNameScndPrsn);
				}
				
				return result;
			}
			
		});
		return persons;
	}

	public void printListPerson(List<Person> persons) {
		StringBuffer buffer = new StringBuffer();
		for(Person person : persons) {
			System.out.println(person.getName());
			buffer.append(person.getName()+"\n");
		}
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("./sorted-names-list.txt"));
			writer.write(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
