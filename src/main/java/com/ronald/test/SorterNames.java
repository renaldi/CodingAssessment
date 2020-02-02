package com.ronald.test;

import com.ronald.test.utility.SorterNamesUtility;

public class SorterNames {

	public static void main(String[] args) {
		SorterNamesUtility sorterNamesUtility = new SorterNamesUtility(args[0]);
		sorterNamesUtility.SorterPersonName(new PersonListImpl());
	}

}
