package main;

import java.util.Scanner;

import staff.Staff;

public class Menu {	
	
	String body;	
	Staff staff = new Staff();
	Scanner scanner = new Scanner(System.in);			
	boolean exit = false;
	
	public void mainMenu() {
		body = "\nCHOOSE AN OPTION AND PRESS ENTER:"
				+ "\n\n1 - ALL STAFF"
				+ "\n2 - STAFF BY CATEGORIES"
				+ "\n3 - ALL ADMIN STAFF AND TASKS"
				+ "\n4 - SEARCH A STAFF MEMBER BY NAME"
				+ "\n\n5 - ALL ANIMALS"
				+ "\n6 - ANIMALS BY TYPES"
				+ "\n7 - SEARCH AN ANIMAL BY NAME"			
				+ "\n\n0 - EXIT"
				+ "\n----------------------------------------";	
		
		System.out.println(body);
	}
	
	/**public void mainMenu() {
		body = "\nCHOOSE AN OPTION AND PRESS ENTER:"
			+ "\n\n1 - STAFF"
			+ "\n2 - ANIMALS"			
			+ "\n\n0 - EXIT"
			+ "\n----------------------------------------";		
		System.out.println(body);	
		
		do {
			int option = scanner.nextInt(); 
		
			switch (option) {
			case 1:
				staffMenu();
				break;
			case 2:
				animalsMenu();
				break;
			case 0:				
				exit = true;				
				System.out.println("FINISHED - THANK YOU");
				break;				
			}
			
		}while(!exit);
		
		scanner.close();
	}*/
	
	public void staffMenu() {		
		body = "\nSTAFF:"
			+ "\n\n1 - ALL STAFF"
			+ "\n2 - STAFF BY CATEGORIES"
			+ "\n3 - ALL ADMIN STAFF PERFORMING A TASK"
			+ "\n4 - SEARCH FOR A STAFF MENBER BY NAME"
			+ "\n\n0 - EXIT"
			+ "\n----------------------------------------";
				
				System.out.println(body);	
				
		do {
			int option = scanner.nextInt(); 
		
			switch (option) {
			case 1:
				staff.listAllStaff();
				break;
			case 2:
				animalsMenu();
				break;
			case 0:				
				exit = true;				
				System.out.println("FINISHED - THANK YOU");
				break;				
			}
			
		}while(!exit);
		
		scanner.close();
				
	}
	
	public void animalsMenu() {		
		body = "\nANIMALS:"
			+ "\n\n1 - All animals "
			+ "\n2 - Animals by types"
			+ "\n3 - Search for an animal by name "
			+ "\n\n0 - EXIT"
			+ "\n----------------------------------------";
			
			System.out.println(body);		
	}
	
	public void staffByCategoriesMenu() {		
		body = "\nSTAFF BY CATEGORIES:"
				+ "\n\n1 - VETERINARIAN"
				+ "\n2 - NURSE"
				+ "\n3 - THERAPIST"
				+ "\n4 - RECEPTIONIST"
				+ "\n5 - IT"
				+ "\n6 - CLEANER"
				+ "\n7 - MARKETING"
				+ "\n\n0 - BACK"
				+ "\n----------------------------------------";
				
				System.out.println(body);	
	}
	
	public void adminTasksMenu() {		
		body = "\nSTAFF BY CATEGORIES:"				
				+ "\n1 - RECEPTIONIST"
				+ "\n2 - IT"
				+ "\n3 - CLEANER"
				+ "\n4 - MARKETING"
				+ "\n\n0 - BACK"
				+ "\n----------------------------------------";
				
				System.out.println(body);	
	}
	
	
}
