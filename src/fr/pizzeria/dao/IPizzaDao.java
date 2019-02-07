package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 *
 */

public interface IPizzaDao {
	
	/**
	 * Renvoi un tableau d'objet listant toutes les pizzas
	 * @return pizzaArray
	 */
	Pizza[] findAllPizzas();
	
	/**
	 * créer une pizza depuis l'objet envoyé
	 * @param pizza
	 */
	void saveNewPizza(Pizza pizza);
	
	/**
	 * Modifie la pizza correspondante au code pizza depuis l'objet envoyé 
	 * @param codePizza
	 * @param pizza
	 */
	void updatePizza(String codePizza, Pizza pizza);
	
	/**
	 * Supprime la pizza dont le code correspond au paramètre
	 * @param codePizza
	 */
	void deletePizza(String codePizza);
	
	/**Renvoi l'objet pizza correspondant au code de l'argument
	 * 
	 * @param codePizza
	 * @return un objet pizza
	 */
	Pizza findPizzaByCode(String codePizza);
	
	/**
	 * Renvoi un boolean true si la pizza est trouver et false si elle n'existe pas
	 * @param codePizza
	 * @return un boolean
	 */
	boolean pizzaExists(String codePizza);
	
}
