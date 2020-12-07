package br.com.brasoccerclub.soccerplayers.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.brasoccerclub.soccerplayers.entities.Position;

public class PositionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min = 7, max = 20, message = "O campo [name] deve ter entre 7 e 20 caracteres")
	@NotBlank(message = "O campo [name] é obrigatório")
	private String name;
	
	@Size(min = 6, max = 10, message = "O campo [fieldArea] deve ter entre 6 e 10 caracteres")
	@NotBlank(message = "O campo [fieldArea] é obrigatório")
	private String fieldArea;
	
	public PositionDTO() {
	}

	public PositionDTO(Long id, String name, String fieldArea) {
		this.id = id;
		this.name = name;
		this.fieldArea = fieldArea;
	}
	
	public PositionDTO(Position entity) {
		id = entity.getId();
		name = entity.getName();
		fieldArea = entity.getFieldArea();
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
