/**
 * Objet pizza avec deux methode de construction
 */

package fr.pizzeria.model;

public class Pizza {
	
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
	
	public 	Pizza(String code, String libelle, double prix, Pizza[] listPizza){
		
		//trouve la taille du tableau
		int i = listPizza.length;
			
	//va fixer l'id en décalant de -1 par rapport à la taille du tableau
		//On prend l'id de la dernière entrée et j'ajoute un
		this.id = (listPizza[i-1].id)+1;
				
		
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
