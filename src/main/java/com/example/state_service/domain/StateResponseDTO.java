package com.example.state_service.domain;

public class StateResponseDTO {

	private Integer id;
	private String stateCode;
	private String stateName;

	public StateResponseDTO() {
	}

	public StateResponseDTO(State state) {
		this.id = state.getId();
		this.stateCode = state.getStateCode();
		this.stateName = state.getStateName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
