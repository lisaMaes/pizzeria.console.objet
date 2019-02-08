package fr.pizzeria.exception;

/**
 * 
 * @author Lisa
 * Classe mere de la gestion des exceptions avec le renvoi de message dans le constructeur
 *
 */

public class StockageException extends Exception{
	
	public StockageException(){
	}
	
	 public StockageException (String msg) { 
		 
		  super(msg); 
	} 
	
}
