package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 * 
 * Sert à appeler et afficher la liste des pizzas
 *
 */

public class ListerPizzasService extends MenuService {

	
	public void executeUC(PizzaMemDao pizzaMemDao, Scanner questionUser) {
		
		System.out.println("Liste des pizzas");
		
		Pizza[] pizzaArray = pizzaMemDao.findAllPizzas();
		
		//Boucle l'affichage des pizzas
		for (int i = 0 ; i < pizzaArray.length ; i++ ){
			
			System.out.println(pizzaArray[i].code + " -> "+ pizzaArray[i].libelle + " ("+ pizzaArray[i].prix+" €)");
		
		}
	}

}
