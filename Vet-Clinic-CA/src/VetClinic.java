import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VetClinic{
	
	public static void main(String[] args) {
		
		String[] names = new String[]{ "Vanessa", "Kelly", "Gael", "Kevin", "Ittalo", "Ken", "Amilcar", "Lana", "Kira", "Kennedy",
				"kathleen", "Muriel", "Winnie", "Hian", "Fiona"};
        String[] surnames = new String[]{"Kaminsky","Mansilla", "Klein","Ospina", "Troche", "Oquendo", "Del Barco", "Aponte",
        		"Healy", "Brahimi", "Koroveshi", "Bauer", "Wimmer", "Barbalho", "Nyman"};        
        
        Staff staff = new Staff();
        
        int staffNumber = 0;
        
        ArrayList<Staff> employees = new ArrayList<Staff>(); 
                
        
        
     
        String menu = "Select an option on the menu and press ENTER\n"
        		+ "1 - List all Staff\n"
        		+ "2 - List Staff by Categories\n"
        		+ "3 - List all Admin Staff and their current activities\n"
        		+ "4 - Search a Staff by name\n"
        		+ "5 - List all animals\n"
        		+ "6 - List all animals by type\n"
        		+ "7 - Search for animal by name\n"
        		+ "0 - Quit";   
                  
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();       
        
       // do {
        	
        	switch (value) {
			case 1:
				System.out.println("List all Staff");
				
				for(int i = 0; i < 40; i++) {              	
		        	String name = (names[new Random().nextInt(names.length)]);
		        	String surname = (surnames[new Random().nextInt(surnames.length)]);
		        	
		        	staffNumber++;
		        	        	
		        	staff = new Staff(name, surname, staffNumber, 500);
		        	employees.add(staff);
		        	
		        	System.out.println(staff.toString());
		        }
				
				break;
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
				
			}
        	
       // }while(value != 0);
        
        
        scanner.close();          

	}
}
