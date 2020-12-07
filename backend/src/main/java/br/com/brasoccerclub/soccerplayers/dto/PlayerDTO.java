package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import br.com.brasoccerclub.soccerplayers.entities.Player;
import br.com.brasoccerclub.soccerplayers.entities.Position;
import br.com.brasoccerclub.soccerplayers.entities.Team;

public class PlayerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min = 10, max = 60, message = "O campo [name] deve ter entre 10 e 60 caracteres")
	@NotBlank(message = "O campo [name] é obrigatório")
	private String name;
	
	@Size(min = 1, max = 99, message = "O campo [jerseyNumber] deve ser entre 1 e 99")
	@Positive
	@NotBlank(message = "O campo [jerseyNumber] é obrigatório")
	private Integer jerseyNumber;
	
	@Past(message = "O campo [birthDate] deve ser uma data passada")
	@NotBlank(message = "O campo [birthDate] é obrigatório")
	private Instant birthDate;
	
	private Team team;
	private Position position;
	
	public PlayerDTO() {
	}

	public PlayerDTO(Long id, String name, Integer jerseyNumber, Instant birthDate, Team team, Position position) {
		this.id = id;
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.birthDate = birthDate;
		this.team = team;
		this.position = position;
	}
	
	public PlayerDTO(Player entity) {
		id = entity.getId();
		name = entity.getName();
		jerseyNumber = entity.getJerseyNumber();
		birthDate = entity.getBirthDate();
		team = entity.getTeam();
		position = entity.getPosition();
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

	public Integer getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(Integer jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
