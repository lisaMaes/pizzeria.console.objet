package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.*;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 * Va appeler la méthode d'ajout de pizza apres avoir réclamer toutes les infos nécessaires
 *
 */

public class AjouterPizzaService extends MenuService{

	
	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) throws StockageException{
	
		
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
			
			System.out.println("Veuillez saisir une categorie de pizza");
			List <String> categorieList = CategoriePizza.findCategoriePizza();
			
			for(String categorie : categorieList){
				
				System.out.println(" "+categorie+" ");
			}
			
			String categorie = questionUser.next();
			
			boolean categorieExists = CategoriePizza.categorieExists(categorie);
			
			if(categorieExists == true){
				
				//Si toute les valeurs on étaient renseignées
				if(code != null && libelle != null && prix != 0 && categorie != null){
					
					pizzaExists = iPizzaDao.pizzaExists(code);
					
					if(pizzaExists == false){					
							
						List<Pizza> pizzaList = iPizzaDao.findAllPizzas();
						
						int id = pizzaList.size();
						
						iPizzaDao.saveNewPizza(new Pizza (id, code, libelle, prix, CategoriePizza.valueOf(categorie.toUpperCase())));
													

					}else{
						
						throw new SavePizzaException();
					}
				}
			}else{
				throw new FindCategoriePizzaException();
			}
			
			
			
		}while(pizzaExists == true);	
		
		System.out.println("Pizza Ajoutée !!");		
			
		
	}
}
