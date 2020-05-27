package staff;

import java.util.ArrayList;
import java.util.Random;

import staff.admin.Cleaner;
import staff.admin.IT;
import staff.admin.Marketing;
import staff.admin.Receptionist;
import staff.medical.Nurse;
import staff.medical.PhysicalTherapist;
import staff.medical.Veterinarian;
/**
 * 
 * @author Íttalo Barbalho * 
 * Class for objects type Staff, it is responsible for grouping all information about veterinary clinic employees. 
 *
 */
public class Staff {
	
	private String name;
	private int staffNumber;
	private static int count = 1;
	private double salaryLevel;	
	private String type;
			
	public Staff() {
		
	}		

	public Staff(String name, double salaryLevel) {		
		this.name = name;
		this.staffNumber = count ++;
		this.salaryLevel = salaryLevel;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}		
	
	public int getStaffNumber() {
		return staffNumber;
	}
	
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;		
	}
	
	public double getSalaryLevel() {
		return salaryLevel;
	}
	
	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
   
   	ArrayList<Staff> staffList = new ArrayList<Staff>();
	ArrayList<Veterinarian> veterinarianList = new ArrayList<Veterinarian>();
	ArrayList<Nurse> nurseList = new ArrayList<Nurse>();
	ArrayList<PhysicalTherapist> therapistList = new ArrayList<PhysicalTherapist>();
	ArrayList<Receptionist> recepcinistList = new ArrayList<Receptionist>();
	ArrayList<IT> itList = new ArrayList<IT>();
	ArrayList<Cleaner> cleanerList = new ArrayList<Cleaner>();
	ArrayList<Marketing> marketingList = new ArrayList<Marketing>();
	
	/**
	 * Method generateNames creates a Full name (Names + Last Name) by a Random search in the array names and surnames.
	 * 
	 * @return String 
	 */
	public String generateNames() {
		
		String[] names = {"Brian", "Cristina", "Francisco", "Lud", "Steve", "Everton", "Vanessa", "Kelly", "Gael", "Kevin", "Ittalo",
				"Ken", "Amilcar", "Lana", "Kira", "Kennedy", "kathleen", "Muriel", "Winnie", "Hian", "Fiona", "Pedro", "Tassio", "Irene", "Li",
				"Emma", "Gavin", "Suellen", "Hanna", "Mario", "Brener", "Wellington", "Ger", "Ana", "Tara", "Gustavo", "Eduardo", "Nildo", "Raphael",
				"Raphaela", "Trump", "Jorge", "Anitta", "Eva", "Luciano", "Bira", "Thais", "Nhelma", "Marcia", "Ju", "Bino", "Carl", "Charlotte"};
	    String[] surnames = {"Kaminsky","Mansilla", "Klein","Ospina", "Troche", "Oquendo", "Del Barco", "Aponte", "Healy", "Brahimi",
	    		"Koroveshi", "Bauer", "Wimmer", "Barbalho", "Nyman", "Smith", "Muriel", "Forde", "Barbosa", "Felix", "Araujo", "Thomas", "Bacelar",
	    		"Justus", "Barros", "Wei", "Schmidt", "Rodriguez", "Lee", "Walker", "White", "Barbosa", "Adams", "Peres", "Roberts", "Cooper",
	    		"Cox", "Torres", "Gray", "Coleman", "Flores", "Ford", "Porter", "Connel", "Ramos", "Olson", "Banks", "Soto", "Hale", "Ball"};    
	    
		String firstName, lastName, fullname;
		
		firstName = (names[new Random().nextInt(names.length)]);
		lastName = (surnames[new Random().nextInt(surnames.length)]);
		fullname = firstName +" "+ lastName;
		
		return fullname;
	}	
	
	/**
	 * The method nameStaff 
	 */
    public void namesStaff() {		   	  	
    	//---------------------- Medical Staff -----------------------    	    	
    	//10 Veterinarian
    	for(int i = 0; i < 10; i++) {     		
    		Veterinarian veterinarian = new Veterinarian(generateNames(), 70000.0);
    		staffList.add(veterinarian);    
    		veterinarianList.add(veterinarian);    		
    	}    	
    	//10 Nurse
    	for(int i = 10; i < 20; i++) {     		
			Nurse nurse = new Nurse(generateNames(), 80000.0);
			staffList.add(nurse); 
			nurseList.add(nurse);    		
    	}    	
    	//10 Physical Therapist
    	for(int i = 0; i < 10; i++) { 
    		PhysicalTherapist physicalTherapist = new PhysicalTherapist(generateNames(), 100000.0);
			staffList.add(physicalTherapist);   
			therapistList.add(physicalTherapist);
    	}       	
    	//------------------------ Admin Staff -----------------------
    	//2 Receptionist
    	/**
    	 * 
    	 * ADMIN STAFF
    	 */
    	for(int i = 0; i < 2; i++) { 
    		Receptionist recepcionist = new Receptionist(generateNames(), 4000.0);
			staffList.add(recepcionist);   
			recepcinistList.add(recepcionist);    		
    	}    	
    	//2 IT
    	for(int i = 0; i < 2; i++) {
    		IT it = new IT(generateNames(), 100000.0);
			staffList.add(it);   
			itList.add(it);
    	}    	
    	//2 Cleaner
    	for(int i = 0; i < 2; i++) { 
    		Cleaner cleaner = new Cleaner(generateNames(), 25000.0);
			staffList.add(cleaner);  
			cleanerList.add(cleaner);			
    	}    	
    	//6 Marketing
    	for(int i = 0; i < 6; i++) { 
    		Marketing marketing = new Marketing(generateNames(), 90000.0);
			staffList.add(marketing);  
			marketingList.add(marketing);
    	}    	        	
	}	
    
	public void listAllStaff() {
		for(Staff list: staffList) {			
			System.out.println("Name: "+list.getName()
					+"\nStaff ID: "+list.getStaffNumber()
					+"\nSalary: "+list.getSalaryLevel()
					+"\n----------------------------------------");		
		}		 			
	}
	
	public void staffByCategorie(int categorie) {			
		if(categorie == 1 ) {
			for(Staff list: veterinarianList) {
				System.out.println(list.getName());				
			}
		}else if(categorie == 2) {
			for(Staff list: nurseList) {
				System.out.println(list.getName());
			}
		}else if(categorie == 3) {
			for(Staff list: therapistList) {
				System.out.println(list.getName());
			}
		}else if(categorie == 4) {
			for(Staff list: recepcinistList) {
				System.out.println(list.getName());
			}
		}else if(categorie == 5) {	
			for(Staff list: itList) {
				System.out.println(list.getName());
			}
		}else if(categorie == 6) {			
			for(Staff list: cleanerList) {
				System.out.println(list.getName());
			}
		}else if(categorie == 7) {		
			for(Staff list: marketingList) {
				System.out.println(list.getName());
			}
		}
	}
	
	public String searchByName(String name) {
		String nameStaff = null;
		for(Staff list: staffList) {			
			if(list.getName().equalsIgnoreCase(name)) {
				//System.out.println(list.getName());
				nameStaff = list.getName();
			}else {
				System.out.println("NAME NOT FOUND");
			}			
		}	
		
		return nameStaff;
	}
	
	public void adminStaffTasks(int typeStaff) {
		
		String[]tasksIT = new String[]{"Making Phone Calls", "Signing Docs", "Fixing PCS", "Buying Equipaments", "Meeting"};
	    String[]tasksCleaner = new String[]{"Cleaning", "Storing suplies"};
	    String[]taksMarketing = new String[] {"Meeting", "Making Phone Calls", "Making new Folder", "Organising Portfolio"};
	    String[]tasksRecepcionist = new String[] {"Making Phone Calls", "Contacting new Customers", "Cheking Appointments"};
	    		
		String tasksITAux, tasksCleanerAux, taksMarketingAux, tasksRecepcionistAux;
				
		if(typeStaff == 1) {
			for(Staff list: recepcinistList) {
				tasksRecepcionistAux = (tasksRecepcionist[new Random().nextInt(tasksRecepcionist.length)]);
				System.out.println(list.getName() +" "+tasksRecepcionistAux);
			}			
		}else if(typeStaff == 2) {
			for(Staff list: itList) {
				tasksITAux = (tasksIT[new Random().nextInt(tasksIT.length)]);
				System.out.println(list.getName()+" "+tasksITAux);
			}
		}else if(typeStaff == 3) {
			for(Staff list: cleanerList) {
				tasksCleanerAux = (tasksCleaner[new Random().nextInt(tasksCleaner.length)]);
				System.out.println(list.getName()+" "+tasksCleanerAux);
			}
		}else if(typeStaff == 4) {
			for(Staff list: marketingList) {
				taksMarketingAux = (taksMarketing[new Random().nextInt(taksMarketing.length)]);
				System.out.println(list.getName()+" - "+taksMarketingAux);
			}
		}
	}	

	
}
