package fr.pizzeria.console;

import java.util.Scanner;
import fr.pizzeria.model.Pizza;

/**
 * 
 * @author Lisa
 *
 */

public class PizzeriaAdminConsoleApp {

	public static void main(String[]args){
		
		Scanner questionUser = new Scanner(System.in) ;
		
		//Initialise la variable a
		int a = 0;
		
		//Initialise le tableau pizza
		Pizza[] pizzaArray =  new Pizza[8];
		int length = pizzaArray.length;
		
		//Rempli le tableau en créant les objets pizza directement
		pizzaArray[0] = new Pizza (0, "PEP", "Péperoni", 12.50);
		pizzaArray[1] = new Pizza (1, "MAR", "Marguerita", 14.00);
		pizzaArray[2] = new Pizza (2, "REIN", "La Reine", 11.50);
		pizzaArray[3] = new Pizza (3, "FRO", "La 4 fromages", 12.50);
		pizzaArray[4] = new Pizza (4, "CAN", "La cannibale", 12.50);
		pizzaArray[5] = new Pizza (5, "SAV", "La Savoyarde", 13.00);
		pizzaArray[6] = new Pizza (6, "ORI", "L'orientale", 13.50);
		pizzaArray[7] = new Pizza (7, "IND", "L'indienne", 14.00); 
		
		
		do{
			
			//Affichage du menu
			System.out.println("*****Pizzeria Administration****");
			
					
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			
			a = questionUser.nextInt() ;
			

			//Liste des pizzas
			if(a == 1){		
				
				System.out.println("Liste des pizzas");
				
				//Boucle l'affichage des pizzas
				for (int i = 0 ; i < length ; i++ ){
					
					System.out.println(pizzaArray[i].id + " -> "+pizzaArray[i].code + " -> "+ pizzaArray[i].libelle + " ("+ pizzaArray[i].prix+" €)");
				
				}
			//Ajouter une pizza
			}else if(a == 2){
				
				//demande les infos et stocke les réponses
				System.out.println("Ajout d'une nouvelle pizza");
				
				System.out.println("Veuillez saisir le code");
					String code = questionUser.next() ;
					
				System.out.println("Veuillez saisir le nom (sans espace)");
				String libelle = questionUser.next() ;
				
				System.out.println("Veuillez saisir le prix");				
				double prix = questionUser.nextDouble() ;
				
				
				//Si toute les valeurs on étaient renseignées
				if(code != null && libelle != null && prix != 0){
				
					Pizza[] arrayTemp = new Pizza[pizzaArray.length+1];
					
					for (int i = 0; i < length ; i++){
						
						arrayTemp[i] = pizzaArray[i];
					}			
					
					arrayTemp[length] = new Pizza (code, libelle, prix, pizzaArray);
						
					
					pizzaArray = arrayTemp;		
					length = pizzaArray.length;
				}
				
				//Mise à jour d'une pizza
			}else if(a == 3){
				
				System.out.println("Mise à jour d'une pizza");
				
				System.out.println("Veuillez saisir le code de la pizza à modifier");
				String code = questionUser.next() ;
				
				//Boucle sur le menu
				for (int i = 0 ; i < length ; i++ ){
					
					//test si le code est égal à un code de la liste
					if(pizzaArray[i].code.equals(code) == true){
						
						System.out.println("Veuillez saisir le nouveau code");
						String newCode = questionUser.next() ;
							
						System.out.println("Veuillez saisir le nouveau nom (sans espace)");
						String newLibelle = questionUser.next() ;
						
						System.out.println("Veuillez saisir le nouveau prix");				
						double newPrix = questionUser.nextDouble() ;
						
						//Si toute les valeurs sont renseignées on modifie les infos
						if(newCode != null && newLibelle != null && newPrix != 0){
							
							pizzaArray[i].code = newCode;
							pizzaArray[i].libelle = newLibelle;
							pizzaArray[i].prix = newPrix;
						}
					}
				
				}
				
				
			}else if(a == 4){
				
				System.out.println("Suppression d'une pizza");
				
				System.out.println("Veuillez saisir le code de la pizza à supprimer");
				String code = questionUser.next() ;
				
				//tableau temporaire plus petit que le précédent
				Pizza[] arrayTemp = new Pizza[pizzaArray.length-1];
				
				//Va servir de compteur temporaire
				int iTemp = 0;
				
				//l'ancien tableau pour recopier les valeurs
				for (int i = 0 ; i < length ; i++ ){					
							
					//seulement pour les valeurs différentes de la pizza à supprimer
					if(!pizzaArray[i].code.equals(code)){
						
						arrayTemp[iTemp] = pizzaArray[i];
						iTemp ++;
					}
				}			
				//le tableau initial par le tableau temporaire
				pizzaArray = arrayTemp;		
				length = pizzaArray.length;
						
			}
			
		}while(a != 99);
		//On boucle tant que l'utilisateur ne tape pas 99
		System.out.println("Au revoir ! ☹");
		
		
		questionUser.close() ;
		
		

	}
}
