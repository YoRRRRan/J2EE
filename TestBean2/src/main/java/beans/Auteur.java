package beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Auteur implements Serializable {
	
	private String nom;
	private String prenom;
	private boolean actif;
	
	
	


	public Auteur() {
		
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	
	

}
