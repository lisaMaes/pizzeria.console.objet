package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.exception.FindCategoriePizzaException;

/**
 * 
 * @author Lisa
 * 
 * Va g�rer toutes  les demandes relatives aux cat�gories de pizza
 *
 */

public enum CategoriePizza {
	
	VIANDE("Viande"),
	POISSON("Poisson"),
	SANS_VIANDE("Sans Viande");
	
	private String categoriePizza;
	
	/**
	 * D�termine la valeur categoriePizza
	 */
	
	private CategoriePizza(String categoriePizza) {
		
		this.categoriePizza = categoriePizza;
		
	}
	
	/**Retourne la valeur(nom) de la cat�gorie de pizza
	 * 
	 * @return categoriePizza
	 */
	public String getCategorie() {
		
		return this.categoriePizza;
		
	}
	
	/**Renvoie la liste de toute les cat�gories existantes
	 * 
	 * @return categorieList
	 */
	public static List<String> findCategoriePizza(){
		
		List<String> categorieList = new ArrayList<String>();
		
		for(CategoriePizza categoriePizza: values()){
			categorieList.add(categoriePizza.categoriePizza);
		}
		
		return categorieList;
	}
	
	/**
	 * Cherche si la cat�gorie pass�e en param�tre existe dans la liste des pizzas
	 * et renvoi un bool�en en fonction de la r�ponse.
	 * Peut d�clencher une erreur si la cat�gorie n'existe pas
	 * @param categorieToFind
	 * @return boolean
	 * @throws FindCategoriePizzaException
	 */
	public static boolean categorieExists(String categorieToFind) throws FindCategoriePizzaException{
		
		boolean exists = false;
		
		List <String> categorieList = CategoriePizza.findCategoriePizza();
		
		for(String categorie : categorieList){
			
			if(categorie.equals(categorieToFind)){
				exists = true;
			}
		}
		
		return exists;
	}

}
