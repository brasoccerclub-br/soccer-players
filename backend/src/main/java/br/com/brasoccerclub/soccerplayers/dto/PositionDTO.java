package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;

import br.com.brasoccerclub.soccerplayers.entities.Position;

public class PositionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String fieldArea;
	
	public PositionDTO() {
	}

	public PositionDTO(Long id, String name, String fieldArea) {
		this.id = id;
		this.name = name;
		this.setFieldArea(fieldArea);
	}
	
	public PositionDTO(Position entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.setFieldArea(entity.getFieldArea());
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

	public String getFieldArea() {
		return fieldArea;
	}

	public void setFieldArea(String fieldArea) {
		this.fieldArea = fieldArea;
	}
}
