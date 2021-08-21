package com.ljsm.cities.api.countries.repositories;

import com.ljsm.cities.api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
