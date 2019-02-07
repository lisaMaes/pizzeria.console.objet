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
		
			

			//Liste des pizzas
			if(a == 1){		
				
				ListerPizzasService listerPizzasService = new ListerPizzasService();
				
				listerPizzasService.executeUC(pizzaMemDao, questionUser);
				
				
			//Ajouter une pizza
			}else if(a == 2){
				
				AjouterPizzaService ajouterPizzaService = new AjouterPizzaService();
			
				ajouterPizzaService.executeUC(pizzaMemDao, questionUser);
				
			//Mise à jour d'une pizza
			}else if(a == 3){
				
				ModifierPizzaService modifierPizzaService = new ModifierPizzaService();
				
				modifierPizzaService.executeUC(pizzaMemDao, questionUser);
			
			}else if(a == 4){
				
				SupprimerPizzaService supprimerPizzaService = new SupprimerPizzaService();		
				supprimerPizzaService.executeUC(pizzaMemDao, questionUser);		
			}
			
		}while(a != 99);
		//On boucle tant que l'utilisateur ne tape pas 99
		System.out.println("Au revoir ! ☹");
		
		
		questionUser.close() ;
		
		

	}
}
