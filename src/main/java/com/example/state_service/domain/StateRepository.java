package com.example.state_service.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {

	State findByStateCode(String stateCode);

}
