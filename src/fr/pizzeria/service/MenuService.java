package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;


/**
 * 
 * @author Lisa
 * 
 * Sert à faire la liaison avec les diff classes Services
 * 
 *
 */

public abstract class MenuService {
	
	public abstract void executeUC(IPizzaDao iPizzaDao, Scanner questionUser) throws StockageException;
}
