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
 *Sert a appeller la classe de modification de pizza si le code est trouv� et les diff�rentes infos remplies
 */

public class ModifierPizzaService extends MenuService {

	
	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) throws StockageException{
		
		
		boolean pizzaExists = false;
		
		do	{
		
			System.out.println("Mise � jour d'une pizza");
			
			System.out.println("Veuillez saisir le code de la pizza � modifier");
			String code = questionUser.next() ;
			
	
			System.out.println("Veuillez saisir le nouveau code");
			String newCode = questionUser.next() ;
				
			System.out.println("Veuillez saisir le nouveau nom (sans espace)");
			String newLibelle = questionUser.next() ;
			
			System.out.println("Veuillez saisir le nouveau prix");				
			double newPrix = questionUser.nextDouble() ;
			
			System.out.println("Veuillez saisir la nouvelle categorie de pizza");
			List <String> categorieList = CategoriePizza.findCategoriePizza();
			
			for(String categorie : categorieList){
				
				System.out.println(" "+categorie+" ");
			}
			
			String newCategorie = questionUser.next();
			
			boolean categorieExists = CategoriePizza.categorieExists(newCategorie);
			
			if(categorieExists == true){
				
				//Si toute les valeurs sont renseign�es on modifie les infos
				if(newCode != null && newLibelle != null && newPrix != 0 && newCategorie != null){
					
					pizzaExists = iPizzaDao.pizzaExists(code);
					
					if(pizzaExists == true){
						
					
						iPizzaDao.updatePizza(code, new Pizza (newCode, newLibelle, newPrix, CategoriePizza.valueOf(newCategorie.toUpperCase())));
						
					}else{
						
						throw new UpdatePizzaException();
					}
					
				
				}
			}else{
				throw new FindCategoriePizzaException();
			}
						
	
		}while(pizzaExists == false);
		
		System.out.println("Pizza modifi�e !!");

		
	}
	
	
}
