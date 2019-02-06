package fr.pizzeria.model;

public class Pizza {
	
	int id;
	char code;
	char libelle;
	double prix;
	
	public Pizza(char code, char libelle, double prix){
		
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Pizza(int id, char code, char libelle, double prix){
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
}
