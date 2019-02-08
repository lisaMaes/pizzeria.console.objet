package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 * 
 * Sert à appeler et afficher la liste des pizzas
 *
 */

public class ListerPizzasService extends MenuService {

	
	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) {
		
		System.out.println("Liste des pizzas");
		
		List<Pizza> pizzaList = iPizzaDao.findAllPizzas();
		
		//Boucle l'affichage des pizzas
		for(Pizza pizza: pizzaList){
			
			System.out.println(pizza.code + " -> "+ pizza.libelle + " ("+ pizza.prix+" €)");
		
		}
	}

}
