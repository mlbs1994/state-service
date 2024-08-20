package com.example.state_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.state_service.domain.State;
import com.example.state_service.domain.StateResponseDTO;
import com.example.state_service.services.StateService;

@RestController
@RequestMapping("/state")
public class StateController {
	
	@Autowired
	StateService service;
	
	@GetMapping("/{stateCode}")
	public ResponseEntity<StateResponseDTO> get(@PathVariable String stateCode) {
		State state = service.findByStateCode(stateCode);
		return ResponseEntity.ok().body(new StateResponseDTO(state));
	}
	
	@GetMapping
	public ResponseEntity<Page<StateResponseDTO>> list(@PageableDefault Pageable pagination) {
		Page<StateResponseDTO> states = service.findAll(pagination);
		return ResponseEntity.ok().body(states);
	}
	
}
