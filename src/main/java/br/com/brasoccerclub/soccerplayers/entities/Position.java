package br.com.brasoccerclub.soccerplayers.entities;

import java.io.Serializable;

public class Position implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String fieldArea;
	
	public Position() {
	}

	public Position(Integer id, String name, String fieldArea) {
		this.id = id;
		this.name = name;
		this.fieldArea = fieldArea;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
