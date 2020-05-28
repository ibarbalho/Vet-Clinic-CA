package main;

import java.util.Scanner;

import animals.Animals;
import staff.Staff;

public class VetClinic {
	
	public static void main(String[] args) {	
	
		Menu menu = new Menu();
		Staff staff = new Staff();
		Animals animals = new Animals();
		
		Scanner scanner = new Scanner(System.in);
				
		boolean exit = false;
				
		int option;
		
		menu.mainMenu();		
		staff.namesStaff();
		animals.namesAnimals();
		
			
		try {	
			
				do {
					
					option = scanner.nextInt();
				 				
				if(option == 0) {
					System.out.println("EXIT - THANK YOU!");
					exit = true;
				}else if(option == 1) {
					System.out.println("1 - ALL STAFF");
					staff.listAllStaff();
					menu.mainMenu();					
					
				}else if(option == 2) {	
					System.out.println("2 - STAFF BY CATEGORIES");
					menu.staffByCategoriesMenu();				
					
					do {
						option = scanner.nextInt(); 						
						if(option == 1) {
							staff.staffByCategorie(1);
							menu.staffByCategoriesMenu();
						}else if(option == 2) {
							staff.staffByCategorie(2);
							menu.staffByCategoriesMenu();
						}else if(option == 3) {
							staff.staffByCategorie(3);
							menu.staffByCategoriesMenu();
						}else if(option == 4) {
							staff.staffByCategorie(4);
							menu.staffByCategoriesMenu();
						}else if(option == 5) {
							staff.staffByCategorie(5);	
							menu.staffByCategoriesMenu();
						}else if(option == 6) {
							staff.staffByCategorie(6);
							menu.staffByCategoriesMenu();
						}else if(option == 7) {
							staff.staffByCategorie(7);
							menu.staffByCategoriesMenu();
						}else if(option == 0){
							menu.mainMenu();
							break;
						}
						
					}while (!exit); 				
					
				}else if(option == 3) {
					System.out.println("3 - ALL ADMIN STAFF AND TASKS");
					menu.adminTasksMenu();
					
					do {						
						option = scanner.nextInt(); 
						if(option == 1) {
							staff.adminStaffTasks(1);						
						}else if(option == 2) {
							staff.adminStaffTasks(2);
						}else if(option == 3) {
							staff.adminStaffTasks(3);
						}else if(option == 4) {
							staff.adminStaffTasks(4);
						}else if(option == 0){
							menu.mainMenu();
							break;
						}
						
					}while (!exit); 	
					
				}else if(option == 4) {
					System.out.println("4 - SEARCH A STAFF MEMBER BY NAME");				
					System.out.println("\nENTER A NAME: ");
					
					do {
						
						scanner.nextLine();
						String search = scanner.nextLine();					
						
						staff.searchByName(search);		
						
						menu.mainMenu();
						break;
						
					}while (!exit); 
					
				}else if(option == 5) {
					System.out.println("5 - ALL ANIMALS");
					animals.listAllAnimals();
					menu.mainMenu();
				}else if(option == 6) {
					
					System.out.println("6 - ANIMALS BY TYPES");
					menu.animalsByType();
					
					do {
						option = scanner.nextInt(); 
						if(option == 1) {
							animals.animlasByType(1);
							menu.animalsByType();
						}else if(option == 2) {
							animals.animlasByType(2);
							menu.animalsByType();
						}else if(option == 3) {
							animals.animlasByType(3);
							menu.animalsByType();
						}else if(option == 4) {
							animals.animlasByType(4);
							menu.animalsByType();
						}else if(option == 5) {
							animals.animlasByType(5);	
							menu.animalsByType();
						}else if(option == 0){
							menu.mainMenu();
							break;
						}
						
					}while (!exit); 				
					
					
				}else if(option == 7) {
					System.out.println("7 - SEARCH AN ANIMAL BY NAME");
					System.out.println("\nENTER A NAME: ");
					
					do {
						scanner.nextLine();
						String search = scanner.nextLine();					
						
						animals.searchAnimalByName(search);
						
						menu.mainMenu();
						break;
						
				}while(!exit);
	
					
				}else {
					System.out.println("CHOOSE A VALID OPTION");
					menu.mainMenu();
				}
				
			}while(!exit);	
						
			scanner.close();
			
			} catch (Exception e) {				
				System.out.println("SORRY, IT IS NOT A NUMBER, CHOOSE A OPTION ON THE MENU");
				
			} 
		

	}
}	


