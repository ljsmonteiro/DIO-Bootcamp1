package com.ljsm.cities.api.states.repositories;

import com.ljsm.cities.api.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
