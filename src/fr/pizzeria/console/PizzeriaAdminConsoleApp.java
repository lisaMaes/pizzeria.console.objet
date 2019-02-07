package fr.pizzeria.console;

import java.util.Scanner;
import fr.pizzeria.dao.PizzaMemDao;
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

		
		PizzaMemDao pizzaMemDao = new PizzaMemDao();
		pizzaMemDao.initialiseArray();

		do{
			
			//Affichage du menu
			System.out.println("*****Pizzeria Administration****");
			
					
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			
			a = questionUser.nextInt() ;
		
			MenuService menuService = MenuServiceFactory.getService(a);
			
			if(menuService != null){
				
				menuService.executeUC(pizzaMemDao, questionUser);
			}

			
		}while(a != 99);
		//On boucle tant que l'utilisateur ne tape pas 99
		System.out.println("Au revoir ! ☹");
		
		
		questionUser.close() ;
		
		

	}
}
