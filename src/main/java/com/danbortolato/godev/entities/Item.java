package com.danbortolato.godev.entities;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private Double value;
	private char type;
	
	public Item() {
	}

	public Item(Long id, String description, Double value, char type) {
		super();
		this.id = id;
		this.description = description;
		this.value = value;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
