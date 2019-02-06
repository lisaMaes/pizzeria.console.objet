package fr.pizzeria.console;

import java.util.Scanner;


public class PizzeriaAdminConsoleApp {

	public static void main(String[]args){
		
		Scanner questionUser = new Scanner(System.in) ; 
		int a = 0;
		
		do{
			System.out.println("*****Pizzeria Administration****");
			
					
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			
			a = questionUser.nextInt() ;
			

			
			if(a == 1){			
				
				System.out.println("Liste des pizzas");
				
			}else if(a == 2){
				
				System.out.println("Ajout d'une nouvelle pizza");
				
			}else if(a == 3){
				
				System.out.println("Mise à jour d'une pizza");
				
			}else if(a == 4){
				
				System.out.println("Suppression d'une pizza");
				
			}
			
		}while(a != 99);
		
		System.out.println("Au revoir ! ☹");
		
		
		questionUser.close() ;
		
		

	}
}
