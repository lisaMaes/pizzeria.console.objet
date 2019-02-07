package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {
	
	public void executeUC(PizzaMemDao pizzaMemDao, Scanner questionUser){
	
		
		boolean pizzaExists = true;
		
		do	{
			
			//demande les infos et stocke les réponses
			System.out.println("Ajout d'une nouvelle pizza");
			
			System.out.println("Veuillez saisir le code");
				String code = questionUser.next() ;
				
			System.out.println("Veuillez saisir le nom (sans espace)");
			String libelle = questionUser.next() ;
			
			System.out.println("Veuillez saisir le prix");				
			double prix = questionUser.nextDouble() ;
			
			
			//Si toute les valeurs on étaient renseignées
			if(code != null && libelle != null && prix != 0){
				
				pizzaExists = pizzaMemDao.pizzaExists(code);
			
				if(pizzaExists == false){
					
					pizzaMemDao.saveNewPizza(new Pizza (code, libelle, prix, pizzaMemDao.findAllPizzas()));

				}else{
					System.out.println("Veuillez choisir un autre code celui ci existe déjà ...");	
				}
			}
			
		}while(pizzaExists == true);	
		
		System.out.println("Pizza Ajoutée !!");		
			
		
	}
}
