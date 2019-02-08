package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * 
 * Si la pizza a modifié n'est pas trouvée
 *
 */

public class UpdatePizzaException extends StockageException{
	
	public UpdatePizzaException(){
		
		super ("Cette pizza n'existe pas");
	}
}
