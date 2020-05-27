package main;

import java.util.Scanner;

import staff.Staff;

public class VetClinic {
	
	public static void main(String[] args) {	
	
		Menu menu = new Menu();
		Staff staff = new Staff();
		Scanner scanner = new Scanner(System.in);
				
		boolean exit = false;
		
		menu.mainMenu();		
		staff.namesStaff();
		
		
			do {
			int option = scanner.nextInt(); 
			
			if(option == 1) {
				
				staff.listAllStaff();
				menu.mainMenu();
				
			}else if(option == 2) {	
				
				menu.staffByCategoriesMenu();				
				
				do {
					option = scanner.nextInt(); 
					if(option == 1) {
						staff.staffByCategorie(1);						
					}else if(option == 2) {
						staff.staffByCategorie(2);
					}else if(option == 3) {
						staff.staffByCategorie(3);
					}else if(option == 4) {
						staff.staffByCategorie(4);
					}else if(option == 5) {
						staff.staffByCategorie(5);						
					}else if(option == 6) {
						staff.staffByCategorie(6);
					}else if(option == 7) {
						staff.staffByCategorie(7);
					}else if(option == 0){
						menu.mainMenu();
						break;
					}
					
				}while (!exit); 				
				
			}else if(option == 3) {
				
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
					
				}while (!exit); 	
				
				
			}
			
		}while(!exit);
	
					
		scanner.close();
	}
}
		
		
			

		
//if(option == 1) {
//	menu.staffMenu();
//	if(option == 1) {
//		staff.listAllStaff();
//	}
//}else if(option == 2) {
//	menu.animalsMenu();
//}else if(option == 0) {
//	exit = true;				
//	System.out.println("FINISHED - THANK YOU");				
//}
					
		
	


