package fr.pizzeria.dao;

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
	
	Pizza[] pizzaArray;
	
	public void initialiseArray(){
		
		//Initialise le tableau pizza
		pizzaArray =  new Pizza[8];

		
		//Rempli le tableau en créant les objets pizza directement
		pizzaArray[0] = new Pizza (0, "PEP", "Péperoni", 12.50);
		pizzaArray[1] = new Pizza (1, "MAR", "Marguerita", 14.00);
		pizzaArray[2] = new Pizza (2, "REIN", "La Reine", 11.50);
		pizzaArray[3] = new Pizza (3, "FRO", "La 4 fromages", 12.50);
		pizzaArray[4] = new Pizza (4, "CAN", "La cannibale", 12.50);
		pizzaArray[5] = new Pizza (5, "SAV", "La Savoyarde", 13.00);
		pizzaArray[6] = new Pizza (6, "ORI", "L'orientale", 13.50);
		pizzaArray[7] = new Pizza (7, "IND", "L'indienne", 14.00); 
		
	}
	

	
	public Pizza[] findAllPizzas(){
		
		
		return this.pizzaArray;
		
	}
	

	public void saveNewPizza(Pizza pizza){
		
			
		int length = pizzaArray.length;
		
		Pizza[] arrayTemp = new Pizza[length+1];
		
		for (int i = 0; i < length ; i++){
			
			arrayTemp[i] = pizzaArray[i];
		}			
		
		arrayTemp[length] = pizza;
		
		pizzaArray = arrayTemp;		


	}
	
	public void updatePizza(String codePizza, Pizza pizza){

		int length = pizzaArray.length;
		
		
		//Boucle sur le menu
		for (int i = 0 ; i < length ; i++ ){
			
			//test si le code est égal à un code de la liste
			if(pizzaArray[i].code.equals(codePizza) == true){
				
				pizzaArray[i].code = pizza.code;
				pizzaArray[i].libelle = pizza.libelle;
				pizzaArray[i].prix = pizza.prix;
			}
		}				
	}
	
	public void deletePizza(String codePizza){
		
		int length = pizzaArray.length;
		
		//tableau temporaire plus petit que le précédent
		Pizza[] arrayTemp = new Pizza[pizzaArray.length-1];
		
		//Va servir de compteur temporaire
		int iTemp = 0;
		
		//l'ancien tableau pour recopier les valeurs
		for (int i = 0 ; i < length ; i++ ){					
					
			//seulement pour les valeurs différentes de la pizza à supprimer
			if(!pizzaArray[i].code.equals(codePizza)){
				
				arrayTemp[iTemp] = pizzaArray[i];
				iTemp ++;
			}
		}			
		//le tableau initial par le tableau temporaire
		
		pizzaArray = arrayTemp;		

	}
	
	public Pizza findPizzaByCode(String codePizza){
		
		Pizza pizzaFound = null;
		
		Pizza[] pizzaArray = findAllPizzas();
		int length = pizzaArray.length;

		//parcoure tout le tableau de toutes pizzas
		for (int i = 0 ; i < length ; i++ ){					
					
			//renvoie l'objet pizza correspondante au codePizza
			if(pizzaArray[i].code.equals(codePizza)){
				
				pizzaFound = pizzaArray[i];
			}
		}
		
		return pizzaFound;
	}
	
	public boolean pizzaExists(String codePizza){
		
		boolean pizzaFound = false;
		
		Pizza[] pizzaArray = findAllPizzas();
		int length = pizzaArray.length;

		//parcoure tout le tableau de toutes pizzas
		for (int i = 0 ; i < length ; i++ ){					
					
			//renvoie l'objet pizza correspondante au codePizza
			if(pizzaArray[i].code.equals(codePizza)){
				
				pizzaFound = true;
			}
		}
		
		return pizzaFound;
	}
}
