package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;


/**
 * 
 * @author Lisa
 * 
 * Sert à appeler la methode de suppression de la pizza en fonction du code taper par l'utilisteur
 *
 */

public class SupprimerPizzaService extends MenuService {

	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) {
	
		boolean pizzaExists = false;
		
		do{
			
			System.out.println("Suppression d'une pizza");
			
			System.out.println("Veuillez saisir le code de la pizza à supprimer");
			String code = questionUser.next() ;
			
			if(code != null){
				
				pizzaExists = iPizzaDao.pizzaExists(code);
				
				if(pizzaExists == true){
					
					iPizzaDao.deletePizza(code);
				}else{
					
					System.out.println("Pizza inconnue. Veuillez retaper le code");
				}
								
			}		
			
		}while (pizzaExists == false);
		
		System.out.println("Pizza Supprimée");
		
	}

}
