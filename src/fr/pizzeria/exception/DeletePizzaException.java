package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * Si la pizza � supprimer n'est pas trouv�e
 *
 */

public class DeletePizzaException extends StockageException{
	
	public DeletePizzaException(){
		
		super ("La pizza n'a pas �t� trouv�e");
	}


}
