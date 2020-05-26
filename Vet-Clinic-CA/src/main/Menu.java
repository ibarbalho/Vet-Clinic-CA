package main;

public class Menu {	
	
	public void showMenu() {
		String header = "CHOOSE AN OPTION AND PRESS ENTER";
		
		String body = "\nSTAFF MENU:"
				+ "\n\n1 - All Staff"
				+ "\n2 - Staff by categories"
				+ "\n3 - All Admin Staff performing his task"
				+ "\n4 - Search for a Staff menber by name"
				+ "\n----------------------------------------"
				+ "\n\nANIMALS MENU:"
				+ "\n\n5 - All animals "
				+ "\n6 - Animals by types"
				+ "\n7 - Search for an animal by name "
				+ "\n----------------------------------------"
				+ "\n\n8 - EXIT";
		
		String footer = "";
		
		System.out.println(header);
		System.out.println(body);		
	}
	
	
}
