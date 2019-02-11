package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.service.*;

/**
 * 
 * @author Lisa
 *
 */

public class PizzeriaAdminConsoleApp {

	public static void main(String[]args){
		
		Scanner questionUser = new Scanner(System.in) ;
		
		//Initialise la variable a
		int a = 0;

		
		IPizzaDao iPizzaDao = new PizzaMemDao();
		iPizzaDao.initialiseArray();

		do{
			
			//Affichage du menu
			System.out.println("*****Pizzeria Administration****");
			
					
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("5. Afficher la liste par catégorie");
			System.out.println("99. Sortir");
			
			a = questionUser.nextInt() ;
		
			MenuService menuService = MenuServiceFactory.getService(a);
			
			if(menuService != null){				
				
				try {
					
					menuService.executeUC(iPizzaDao, questionUser);
					
				} catch (StockageException stockageException) {
					
					stockageException.printStackTrace();						
				}
				
			}

			
		}while(a != 99);
		//On boucle tant que l'utilisateur ne tape pas 99
		System.out.println("Au revoir ! ☹");
		
		
		questionUser.close() ;
		
		

	}
}
