/**
 * Objet pizza avec deux methodes de construction
 * dont l'une sans l'id prevue pour l'incrémentation automatique en BDD
 */

package fr.pizzeria.model;

public class Pizza {
	
	public static int nbPizza;
	
	public int id;
	public String code;
	public String libelle;
	public double prix;
	
	/**
	 * 
	 * @param code code indentification unique de la pizza
	 * @param libelle nom de la pizza
	 * @param prix prix en double 
	 * @param listPizza array d'objets des pizza
	 */
	
	public 	Pizza(String code, String libelle, double prix){
		
		id = nbPizza++;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	/**
	 * 
	 * @param id id unique des pizza auto incrémenté
	 * @param code code unique d'indentification de la pizza
	 * @param libelle nom de la pizza
	 * @param prix prix en double
	 */
	
	public Pizza(int id, String code, String libelle, double prix){
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
}
