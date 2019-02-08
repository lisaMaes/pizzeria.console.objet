package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.*;

import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 * Va appeler la m�thode d'ajout de pizza apres avoir r�clamer toutes les infos n�cessaires
 *
 */

public class AjouterPizzaService extends MenuService{

	
	public void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) throws StockageException{
	
		
		boolean pizzaExists = true;
		
		do	{
			
			//demande les infos et stocke les r�ponses
			System.out.println("Ajout d'une nouvelle pizza");
			
			System.out.println("Veuillez saisir le code");
				String code = questionUser.next() ;
				
			System.out.println("Veuillez saisir le nom (sans espace)");
			String libelle = questionUser.next() ;
			
			System.out.println("Veuillez saisir le prix");				
			double prix = questionUser.nextDouble() ;
			
			
			//Si toute les valeurs on �taient renseign�es
			if(code != null && libelle != null && prix != 0){
				
				pizzaExists = iPizzaDao.pizzaExists(code);
				
				if(pizzaExists == false){					
						
					List<Pizza> pizzaList = iPizzaDao.findAllPizzas();
					
					int id = pizzaList.size();
					
					iPizzaDao.saveNewPizza(new Pizza (id, code, libelle, prix));
												

				}else{
					
					throw new SavePizzaException();
				}
			}
			
		}while(pizzaExists == true);	
		
		System.out.println("Pizza Ajout�e !!");		
			
		
	}
}
