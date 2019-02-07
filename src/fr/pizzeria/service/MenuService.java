package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

public abstract class MenuService {
	
	public abstract void executeUC(PizzaMemDao pizzaMemDao, Scanner questionUser);
}
