package main;

import java.util.ArrayList;

import staff.Staff;
import staff.medical.Nurse;
import staff.medical.Veterinarian;

public class VetClinic {
	
	public static void main(String[] args) {
		
//		List all Staff - OK
//		List staff by categories (e.g. list all Nurses)
//		List all Admin staff performing a certain task 
//		Search for a specific member of staff by name
//		List all animals
//		List animals by various types (e.g. list all dogs)
//		Search for a specific animal by name 
		
//		-----------------------------------------------------------
		
//		List all the animals assigned to a member of medical staff 
//		List the order in which pets will be looked after by a particular member of the medical staff
//		For a given member of the medical staff, pass to the next pet.
		
		Staff staff = new Staff();
		Staff staff1 = new Veterinarian();
		staff.namesStaff();
		staff.listAllStaff();
		//staff.lisAllVeterinarian();
		
		//staff.staffByCategorie(1);
		
		//staff.searchByName("Kevin Barbosa");
		//staff.adminStaffTasks("marketing");
		
		//staff.lisAllCleaner();
		
//		Nurse nurse = new Nurse();
//		nurse.getName();
//		ArrayList<String> teste = new ArrayList<String>();
//		teste.add("Ittalo Barbalho");
//		teste.add("Ittalo Barbalho1");
//		teste.add("Julio Frano");
//		
//		for(int i = 0; i < teste.size(); i++) {
//			
//			System.out.println(teste.contains("Ittalo"));
//		}
//		for(list: teste) {	
//			//System.out.println(list.getName());
//			System.out.println(list.getName().contains(name);			
//		}	
		
		
		
	}
}
//		Menu menu = new Menu();
//		Staff staff = new Staff();
		
		
		
		/**Scanner scanner = new Scanner(System.in);
		
		menu.showMenu();
		int optionUser = scanner.nextInt(); 
		boolean exit = false;
		
		
		do {
			
			switch (optionUser) {
			case 1:
				System.out.println("\n----------------------");
				System.out.println("1 - All Staff");	
				System.out.println("\n0 - BACK MENU\n");
				staff.listAllStaff();
				exit = true;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;

			default:
				break;
			}
			
			
		
			
		}while(!exit);
		
		scanner.close();*/
		
		/**	
			if(optionUser == 1) {
				System.out.println("\n----------------------");
				System.out.println("1 - All Staff");	
				System.out.println("\n0 - BACK MENU\n");
				staff.listAllStaff();
				exit = true;
			}else if(optionUser == 2) {
				
				exit = true;
			}else if(optionUser == 3) {
				
				exit = true;
			}else if(optionUser == 4) {
				
				exit = true;
			}else if(optionUser == 5) {
				
				exit = true;
			}else if(optionUser == 6) {
				
				exit = true;
			}else if(optionUser == 7) {
				
				exit = true;
			}else if(optionUser == 8) {
				
			}
			
		}while(!exit);*/
		
		
		
					
		
	


