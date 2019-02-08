package fr.pizzeria.dao;

import java.util.List;
import fr.pizzeria.exception.*;
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
	 * @throws si la pizza existe déjà
	 */
	void saveNewPizza(Pizza pizza) throws SavePizzaException;
	
	/**
	 * Modifie la pizza correspondante au code pizza depuis l'objet envoyé 
	 * @param codePizza
	 * @param pizza
	 * @throws si la pizza à modifier n'existe pas
	 */
	void updatePizza(String codePizza, Pizza pizza) throws UpdatePizzaException, PizzaExistsException;
	
	/**
	 * Supprime la pizza dont le code correspond au paramètre
	 * @param codePizza
	 * @throws PizzaExistsException 
	 * @throws si la pizza à supprimer n'existe pas
	 */
	void deletePizza(String codePizza) throws DeletePizzaException;
	
	/**Renvoi l'objet pizza correspondant au code de l'argument
	 * 
	 * @param codePizza
	 * @return un objet pizza
	 * @throws si la pizza rechercher n'existe pas
	 */
	Pizza findPizzaByCode(String codePizza) throws PizzaExistsException;
	
	/**
	 * Renvoi un boolean true si la pizza est trouver et false si elle n'existe pas
	 * @param codePizza
	 * @return un boolean
	 */
	boolean pizzaExists(String codePizza);
	
}
