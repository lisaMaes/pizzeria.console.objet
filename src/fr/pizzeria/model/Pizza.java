package fr.pizzeria.model;

public class Pizza {
	
	public int id;
	public String code;
	public String libelle;
	public double prix;
	
	public 	Pizza(String code, String libelle, double prix, Pizza[] listPizza){
		
		int i = listPizza.length;
			
		this.id = (listPizza[i-1].id)+1;
				
		
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Pizza(int id, String code, String libelle, double prix){
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
}
