package fr.pizzeria.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class testDao {
	

	IPizzaDao dao;
	
	
	@Before
	public void setUp(){
		
		dao = new PizzaMemDao();
	}
	
	@After	
	public void tearDown(){
		
	}
	
	@Test
	public void testAddNewPizza() throws StockageException{
		assertTrue("tableau vide", dao.findAllPizzas().isEmpty());
		dao.saveNewPizza(new Pizza("TES", "test", 10, CategoriePizza.VIANDE));
		assertTrue("Je dois trouver ma pizza", dao.pizzaExists("TES"));
	}
	
	@Test
	public void testUpdatePizza() throws StockageException{
		dao.saveNewPizza(new Pizza("TES", "test", 10, CategoriePizza.VIANDE));

		dao.updatePizza("TES", new Pizza("TES", "essai", 12, CategoriePizza.POISSON));

		assertTrue("Je dois avoir modifier ma pizza", dao.findPizzaByCode("TES").libelle.equals("essai"));		
	}
	
	@Test
	public void testDeletePizza() throws StockageException{
		dao.saveNewPizza(new Pizza("TES", "test", 10, CategoriePizza.VIANDE));

		dao.deletePizza("TES");

		assertFalse("Je dois avoir supprimer ma pizza", dao.pizzaExists("TES"));		
	}
	
	

}
