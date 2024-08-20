package com.example.state_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.state_service.domain.State;
import com.example.state_service.domain.StateRepository;
import com.example.state_service.domain.StateResponseDTO;

@Service
public class StateService {

	@Autowired
	StateRepository repository;
	
	public State findByStateCode(String stateCode) {
		return repository.findByStateCode(stateCode);
	}

	public Page<StateResponseDTO> findAll(Pageable pagination) {
		return repository.findAll(pagination).map(StateResponseDTO::new);
	}

}
