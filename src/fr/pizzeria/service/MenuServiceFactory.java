package fr.pizzeria.service;


/**
 * 
 * @author Lisa
 * sert de controller et renvoi à la bonne methode de service
 *
 */

public class MenuServiceFactory {
	
	public static MenuService getService(int choice){
		
		MenuService menuService = null;
		
		switch (choice) {
		case 1:
			//Ajout de pizza
			menuService = new ListerPizzasService();
			
			break;
			
		case 2:
			//modifier une pizza
			menuService = new AjouterPizzaService();
			
			break;
			
		case 3:
			//modifier une pizza
			menuService = new ModifierPizzaService();
			
			break;
			
		case 4:
			//supprimer une pizza
			menuService = new SupprimerPizzaService();		
			
			break;
		case 5:
			//Lister par catégorie
			menuService = new ListerPizzaParCategorieService();		
			
			break;
		
		}
		
		return menuService;
		
	}
}
