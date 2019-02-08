package fr.pizzeria.dao;

/**
 * 
 * @author Lisa
 * Sert de controller sur la question de la gestion du type de mémoire
 * 
 *
 */
public class PizzaDaoFactory {
	
	public static IPizzaDao getDao(int choice){
		
		IPizzaDao iPizzaDao = null;
		
		switch (choice) {
		case 1:
			
			iPizzaDao = new PizzaMemDao();
			
			break;

		default:
			
			iPizzaDao = new PizzaMemDao();
			
			break;
		}
		
		return iPizzaDao;
	}
}
