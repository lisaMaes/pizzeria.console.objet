package fr.pizzeria.exception;

public class FindCategoriePizzaException extends StockageException{
	
public FindCategoriePizzaException(){
		
		super ("Cette cat�gorie n'existe pas. Veuillez v�rifier l'orthographe");
	}
}


