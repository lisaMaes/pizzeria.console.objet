package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * 
 * Si la pizza a modifi� n'est pas trouv�e
 *
 */

public class UpdatePizzaException extends StockageException{
	
	public UpdatePizzaException(){
		
		super ("Cette pizza n'existe pas");
	}
}
