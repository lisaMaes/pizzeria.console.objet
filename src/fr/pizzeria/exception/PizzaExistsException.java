package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 *Si la pizza n'existe pas
 */

public class PizzaExistsException extends StockageException{
	
	public PizzaExistsException(){
		super ("La pizza n'existe pas");
	}
}
