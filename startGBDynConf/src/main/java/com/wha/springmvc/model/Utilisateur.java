package com.wha.springmvc.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
