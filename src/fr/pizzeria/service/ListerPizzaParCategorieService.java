package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.FindCategoriePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 * 
 * Sert à appeler et afficher la liste des pizzas par caétgorie
 *
 */

public class ListerPizzaParCategorieService extends MenuService {

	
	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) throws StockageException{
		
		boolean categorieExists = false;
		
		do{
			System.out.println("Veuillez saisir une categorie de pizza");
			List <String> categorieList = CategoriePizza.findCategoriePizza();
			
			for(String categorie : categorieList){
				
				System.out.println(" "+categorie+" ");
			}
			
			String categorie = questionUser.next();
			
			categorieExists = CategoriePizza.categorieExists(categorie);
			
			if(categorieExists == true){
				
				List<Pizza> pizzaList = iPizzaDao.findPizzaByCategorie(categorie);

				//Boucle l'affichage des pizzas
				for(Pizza pizza: pizzaList){					
					System.out.println(pizza.toString(pizza));
				
				}
			}else{
				
				throw new FindCategoriePizzaException();
			}
				
		}while(categorieExists == false);

	}

}
