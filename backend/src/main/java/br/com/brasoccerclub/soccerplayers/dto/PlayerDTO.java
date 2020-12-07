package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.brasoccerclub.soccerplayers.entities.Player;
import br.com.brasoccerclub.soccerplayers.entities.Position;
import br.com.brasoccerclub.soccerplayers.entities.Team;

public class PlayerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer jerseyNumber;
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
