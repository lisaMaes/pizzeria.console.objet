package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * Si la pizza à supprimer n'est pas trouvée
 *
 */

public class DeletePizzaException extends StockageException{
	
	public DeletePizzaException(){
		
		super ("La pizza n'a pas été trouvée");
	}


}
