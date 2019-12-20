package com.demo.db;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Country;

public class Countdb {
	private static ArrayList<Country> countryList = new ArrayList<Country>();

	static {

		countryList.add(new Country("1", "Australia", "3234567"));
		countryList.add(new Country("2", "NewZealand", "4564567"));
		countryList.add(new Country("3", "Afghanistan", "5034567"));
		countryList.add(new Country("4", "Bangladesh", "45422567"));
		countryList.add(new Country("5", "Nepal", "134567000"));
	}

	public static ArrayList<Country> getCountryList() {

		return countryList;
	}

	public static void setCountryList(List<Country> countryList) {

		Countdb.countryList = (ArrayList<Country>) countryList;
	}
}
