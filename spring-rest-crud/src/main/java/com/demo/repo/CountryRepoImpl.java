package com.demo.repo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.demo.db.Countdb;
import com.demo.model.Country;

@Repository
public class CountryRepoImpl
		implements ICountryRepo {

	@Override
	public List<Country> getAllCountries() {

		return Countdb.getCountryList();
	}

	@Override
	public void addCountry(Country country) {

		Countdb.getCountryList().add(country);
	}

	@Override
	public Country deleteCountry(int id) {

		return Countdb.getCountryList()
				.remove(id);
	}

	@Override
	public Country searchCountry(int id) {
		//Java 8 Stream API
		Stream<Country> countryListStream = Countdb.getCountryList().stream();
		Stream<Country> countryListFilteredStream = countryListStream.filter(country -> Integer.parseInt(country.getCountryId()) == id);
		Optional<Country> searchCountryOptional = countryListFilteredStream.findFirst();
		Country searchCountry = searchCountryOptional.get();
		return searchCountry;
		
//	return CountryDB.getCountryList().stream()
//	.filter(c -> Integer.parseInt(
//			c.getCountryId()) == id)
//	.findFirst().get();
	}
}
