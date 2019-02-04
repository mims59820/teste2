package com.wha.springmvc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("client")

public class Client extends Utilisateur{
	

	private String adresse;
	private String situationmatrimoniale;
	private int nbEnfant;
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSituationmatrimoniale() {
		return situationmatrimoniale;
	}
	public void setSituationmatrimoniale(String situationmatrimoniale) {
		this.situationmatrimoniale = situationmatrimoniale;
	}
	public int getNbEnfant() {
		return nbEnfant;
	}
	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}
	public Client(String adresse, String situationmatrimoniale, int nbEnfant) {
		super();
		this.adresse = adresse;
		this.situationmatrimoniale = situationmatrimoniale;
		this.nbEnfant = nbEnfant;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
