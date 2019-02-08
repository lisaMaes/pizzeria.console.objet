package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 *
 */

public interface IPizzaDao {
	
	/**
	 * Initialise la liste d'exemple de pizza
	 */
	
	void initialiseArray();
	
	
	/**
	 * Renvoi une collection List de l'objet pizza
	 * @return pizzaList
	 */
	List<Pizza> findAllPizzas();
	
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
