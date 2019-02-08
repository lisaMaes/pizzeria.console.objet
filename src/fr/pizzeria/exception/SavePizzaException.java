package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * Activer si la pizza existe déjà (code) 
 *
 */

public class SavePizzaException extends StockageException{
	
	public SavePizzaException(){
		
		super ("Veuillez choisir un autre code celui ci existe déjà ...");
	}
}
