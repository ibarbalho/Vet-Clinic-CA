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

public class Staff {
	
	private String name;
	private int staffNumber;
	private double salaryLevel;	
	
	ArrayList<Staff> staffList = new ArrayList<Staff>();
	
		
	public Staff() {
		
	}		

	public Staff(String name, int staffNumber, double salaryLevel) {		
		this.name = name;
		this.staffNumber = staffNumber;
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
	
		
	@Override
	public String toString() {
		return "Name = " + name +				
				"\nStaffNumber = " + staffNumber +
				"\nSalary = " + salaryLevel+
				"\n-----------------------------";
				
	}
	

	String[] names = new String[]{ "Vanessa", "Kelly", "Gael", "Kevin", "Ittalo", "Ken", "Amilcar", "Lana", "Kira", "Kennedy",
			"kathleen", "Muriel", "Winnie", "Hian", "Fiona"};
    String[] surnames = new String[]{"Kaminsky","Mansilla", "Klein","Ospina", "Troche", "Oquendo", "Del Barco", "Aponte",
    		"Healy", "Brahimi", "Koroveshi", "Bauer", "Wimmer", "Barbalho", "Nyman"};    
      
   
	
    public void namesStaff() {
		
    	String firstName, lastName, fullname;    
    	  	
    	//Medical Staff -----------    	    	
    	//10 Veterinarian
    	for(int i = 0; i < 10; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
    		Staff veterinarian = new Veterinarian(fullname, i, 70.000);
    		staffList.add(veterinarian);    		
    	}
    	
    	//10 Nurse
    	for(int i = 0; i < 10; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff nurse = new Nurse(fullname, i, 80.000);
    		staffList.add(nurse);    		
    		
    	}
    	
    	//10 Physical Therapist
    	for(int i = 0; i < 10; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff physicalTherapist = new PhysicalTherapist(fullname, i, 100.000);
    		staffList.add(physicalTherapist);   
    		
    	}   
    	
    	//Admin Staff -------------
    	//2 Receptionist
    	for(int i = 0; i < 2; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff recepcionist = new Receptionist(fullname, i, 100.000);
    		staffList.add(recepcionist);   
    		
    	}
    	
    	//2 IT
    	for(int i = 0; i < 2; i++) {
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff it = new IT(fullname, i, 100.000);
    		staffList.add(it);   
    	}
    	
    	//2 Cleaner
    	for(int i = 0; i < 2; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff cleaner = new Cleaner(fullname, i, 100.000);
    		staffList.add(cleaner);  
    	}
    	
    	//6 Marketing
    	for(int i = 0; i < 6; i++) { 
    		firstName = (names[new Random().nextInt(names.length)]);
			lastName = (surnames[new Random().nextInt(surnames.length)]);
			fullname = firstName +" "+ lastName;
			Staff marketing = new Marketing(fullname, i, 100.000);
    		staffList.add(marketing);  
    	}
    	
    	
    	
//    	for(Staff list: staffList) {
//    		System.out.println(list);    		
//    	}
    	
//    	for(Veterinarian list: medicalStaff) {
//    		System.out.println(list);
//    	}
//    	
//    	for(Nurse list: staffList) {
//    		System.out.println(list);
//    	}
//    	
//    	for(PhysicalTherapist list: staffList) {
//    		System.out.println(list);
//    	}
    	
    	
	}	
    
	public void ListAllStaff() {
		 
		for(Staff list: staffList) {
			System.out.println(list);
		}
		 
		//System.out.println(staffList.size());
	
	}
    
   
	
}
