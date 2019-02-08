package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * 
 * @author lisa
 *
 */

public class PizzaMemDao implements IPizzaDao{

	
	/**Intialise les pizzas si elles existent pas
	 * Renvoi un tableau d'objet listant toutes les pizzas
	 * @return pizzaArray
	 */
	
	List<Pizza> pizzaList;
	
	public void initialiseArray(){
		
		//Initialise le tableau pizza
		pizzaList =  new ArrayList<Pizza>();

		
		//Rempli le tableau en créant les objets pizza directement
		pizzaList.add(new Pizza (0, "PEP", "Péperoni", 12.50));
		pizzaList.add(new Pizza (1, "MAR", "Marguerita", 14.00));
		pizzaList.add(new Pizza (2, "REIN", "La Reine", 11.50));
		pizzaList.add(new Pizza (3, "FRO", "La 4 fromages", 12.50));
		pizzaList.add(new Pizza (4, "CAN", "La cannibale", 12.50));
		pizzaList.add(new Pizza (5, "SAV", "La Savoyarde", 13.00));
		pizzaList.add(new Pizza (6, "ORI", "L'orientale", 13.50));
		pizzaList.add(new Pizza (7, "IND", "L'indienne", 14.00)); 
		
	}
	
	public List<Pizza> findAllPizzas(){		
		
		return this.pizzaList;		
	}	

	public void saveNewPizza(Pizza pizza){		
			
		pizzaList.add(pizza);
	}
	
	public void updatePizza(String codePizza, Pizza pizza){

		Pizza pizzaFound = this.findPizzaByCode(codePizza);
			
		int i = pizzaFound.id;
		
		pizzaList.set(i,pizza);			
					
	}
	
	public void deletePizza(String codePizza){
		
		Pizza pizzaFound = this.findPizzaByCode(codePizza);
		
		pizzaList.remove(pizzaFound.id);		
		
	}
	
	public Pizza findPizzaByCode(String codePizza){
		
		Pizza pizzaFound = null;
		
		for(Pizza pizza: pizzaList){			
			
			if(pizza.code.equals(codePizza)){
				pizzaFound = pizza;
			}
		}
		
		
		return pizzaFound;
	}
	
	public boolean pizzaExists(String codePizza){
		
		boolean pizzaFound = false;
		
		for(Pizza pizza: pizzaList){
			
			
			if(pizza.code.equals(codePizza)){
				pizzaFound = true;
			}
		}
		
		return pizzaFound;
	}
}
