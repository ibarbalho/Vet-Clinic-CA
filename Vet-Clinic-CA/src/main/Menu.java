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
				+ "\n6 - ANIMALS BY TYPE"
				+ "\n7 - SEARCH AN ANIMAL BY NAME"			
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
		body = "\nADMIN STAFF AND TASKS:"				
				+ "\n1 - RECEPTIONIST"
				+ "\n2 - IT"
				+ "\n3 - CLEANER"
				+ "\n4 - MARKETING"
				+ "\n\n0 - BACK"
				+ "\n----------------------------------------";
				
				System.out.println(body);	
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
	
	public void animlasByType() {		
		body = "\nANIMALS BY TYPE:"
				+ "\n\n1 - CAT"
				+ "\n2 - DOG"
				+ "\n3 - HORSE"
				+ "\n4 - PIG"
				+ "\n5 - TURTLE"				
				+ "\n\n0 - BACK"
				+ "\n----------------------------------------";
				
				System.out.println(body);	
	}
	
//	public int userImput() {
//		
//		
//		
//	}
	
}
