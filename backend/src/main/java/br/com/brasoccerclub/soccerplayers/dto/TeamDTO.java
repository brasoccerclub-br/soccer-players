package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.brasoccerclub.soccerplayers.entities.Team;

public class TeamDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min = 5, max = 20, message = "O campo [name] deve ter entre 5 e 20 caracteres")
	@NotBlank(message = "O campo [name] é obrigatório")
	private String name;
	
	@Size(min = 3, max = 3, message = "O campo [acronym] deve ter 3 caracteres")
	@NotBlank(message = "O campo [acronym] é obrigatório")
	private String acronym;
	
	@Size(min = 5, max = 30, message = "O campo [city] deve ter entre 5 e 30 caracteres")
	@NotBlank(message = "O campo [city] é obrigatório")
	private String city;
	
	@Size(min = 2, max = 2, message = "O campo [state] deve ter 2 caracteres")
	@NotBlank(message = "O campo [state] é obrigatório")
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
