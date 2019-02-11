package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.exception.FindCategoriePizzaException;

/**
 * 
 * @author Lisa
 * 
 * Va gérer toutes  les demandes relatives aux catégories de pizza
 *
 */

public enum CategoriePizza {
	
	VIANDE("Viande"),
	POISSON("Poisson"),
	SANS_VIANDE("Sans Viande");
	
	private String categoriePizza;
	
	/**
	 * Détermine la valeur categoriePizza
	 */
	
	private CategoriePizza(String categoriePizza) {
		
		this.categoriePizza = categoriePizza;
		
	}
	
	/**Retourne la valeur(nom) de la catégorie de pizza
	 * 
	 * @return categoriePizza
	 */
	public String getCategorie() {
		
		return this.categoriePizza;
		
	}
	
	/**Renvoie la liste de toute les catégories existantes
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
	 * Cherche si la catégorie passée en paramètre existe dans la liste des pizzas
	 * et renvoi un booléen en fonction de la réponse.
	 * Peut déclencher une erreur si la catégorie n'existe pas
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
