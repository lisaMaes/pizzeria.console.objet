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
	 * cr�er une pizza depuis l'objet envoy�
	 * @param pizza
	 * @throws si la pizza existe d�j�
	 */
	void saveNewPizza(Pizza pizza) throws SavePizzaException;
	
	/**
	 * Modifie la pizza correspondante au code pizza depuis l'objet envoy� 
	 * @param codePizza
	 * @param pizza
	 * @throws si la pizza � modifier n'existe pas
	 */
	void updatePizza(String codePizza, Pizza pizza) throws UpdatePizzaException, PizzaExistsException;
	
	/**
	 * Supprime la pizza dont le code correspond au param�tre
	 * @param codePizza
	 * @throws PizzaExistsException 
	 * @throws si la pizza � supprimer n'existe pas
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
