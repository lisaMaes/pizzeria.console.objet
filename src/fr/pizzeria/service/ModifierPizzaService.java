package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {

	
	public void executeUC(PizzaMemDao pizzaMemDao, Scanner questionUser) {
		
		
		boolean pizzaExists = false;
		
		do	{
		
			System.out.println("Mise à jour d'une pizza");
			
			System.out.println("Veuillez saisir le code de la pizza à modifier");
			String code = questionUser.next() ;
			
	
			System.out.println("Veuillez saisir le nouveau code");
			String newCode = questionUser.next() ;
				
			System.out.println("Veuillez saisir le nouveau nom (sans espace)");
			String newLibelle = questionUser.next() ;
			
			System.out.println("Veuillez saisir le nouveau prix");				
			double newPrix = questionUser.nextDouble() ;
					
			//Si toute les valeurs sont renseignées on modifie les infos
			if(newCode != null && newLibelle != null && newPrix != 0){
				
				pizzaExists = pizzaMemDao.pizzaExists(code);
				
				if(pizzaExists == true){
					
					pizzaMemDao.updatePizza(code ,new Pizza (newCode, newLibelle, newPrix, pizzaMemDao.findAllPizzas()));
				}else{
					
					System.out.println("Pizza inconnue. Veuillez retaper le code");
				}
				
			
			}
		}while(pizzaExists == false);
		
		System.out.println("Pizza modifiée !!");

		
	}
	
	
}
