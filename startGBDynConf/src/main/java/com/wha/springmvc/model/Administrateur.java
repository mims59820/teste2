package com.wha.springmvc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur {
	
	

}
