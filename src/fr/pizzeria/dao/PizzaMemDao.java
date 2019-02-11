package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.CategoriePizza;
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
	
	List<Pizza> pizzaList =  new ArrayList<Pizza>();
	
	public void initialiseArray(){
		
		//Rempli le tableau en créant les objets pizza directement
		pizzaList.add(new Pizza ("PEP", "Péperoni", 12.50, CategoriePizza.VIANDE));
		pizzaList.add(new Pizza ("MAR", "Marguerita", 14.00, CategoriePizza.SANS_VIANDE));
		pizzaList.add(new Pizza ("REIN", "La Reine", 11.50, CategoriePizza.VIANDE));
		pizzaList.add(new Pizza ("FRO", "La 4 fromages", 12.50, CategoriePizza.SANS_VIANDE));
		pizzaList.add(new Pizza ("CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		pizzaList.add(new Pizza ("SAV", "La Savoyarde", 13.00, CategoriePizza.VIANDE));
		pizzaList.add(new Pizza ("ORI", "L'orientale", 13.50, CategoriePizza.VIANDE));
		pizzaList.add(new Pizza ("IND", "L'indienne", 14.00, CategoriePizza.VIANDE)); 
		pizzaList.add(new Pizza ("SAU", "La Saumon", 14.00, CategoriePizza.POISSON));
		
	}
	
	public List<Pizza> findAllPizzas(){		
		
		return this.pizzaList;		
	}	

	public void saveNewPizza(Pizza pizza){		
			
			pizzaList.add(pizza);
		

	}
	
	public void updatePizza(String codePizza, Pizza pizza){
	
			
		Pizza pizzaFound = this.findPizzaByCode(codePizza);
		
		int i = pizzaList.indexOf(pizzaFound);

		pizzaList.set(i, pizza);	
			
					
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
	
	public List<Pizza> findPizzaByCategorie(String categorie){
	
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		
		List<Pizza> allPizzaList = this.findAllPizzas();
	
		for(Pizza pizza: allPizzaList){			

			if(pizza.categoriePizza.equals(CategoriePizza.valueOf(categorie.toUpperCase()))){
		
				pizzaList.add(pizza);
			}
		}
		
		return pizzaList;
	}
}
