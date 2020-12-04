package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;

import br.com.brasoccerclub.soccerplayers.entities.Team;

public class TeamDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String acronym;
	private String city;
	private String state;
	
	public TeamDTO() {
	}

	public TeamDTO(Long id, String name, String acronym, String city, String state) {
		this.id = id;
		this.name = name;
		this.acronym = acronym;
		this.city = city;
		this.state = state;
	}

	public TeamDTO(Team entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.acronym = entity.getAcronym();
		this.city = entity.getCity();
		this.state = entity.getState();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
