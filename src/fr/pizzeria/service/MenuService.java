package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

/**
 * 
 * @author Lisa
 * 
 * Sert à faire la liaison avec les diff classes Services
 * 
 *
 */

public abstract class MenuService {
	
	public abstract void executeUC(PizzaMemDao pizzaMemDao, Scanner questionUser);
}
