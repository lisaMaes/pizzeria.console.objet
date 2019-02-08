package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;


/**
 * 
 * @author Lisa
 * 
 * Sert à faire la liaison avec les diff classes Services
 * 
 *
 */

public abstract class MenuService {
	
	public abstract void executeUC(IPizzaDao iPizzaDao, Scanner questionUser);
}
