package fr.pizzeria.exception;

public class FindCategoriePizzaException extends StockageException{
	
public FindCategoriePizzaException(){
		
		super ("Cette catégorie n'existe pas. Veuillez vérifier l'orthographe");
	}
}


