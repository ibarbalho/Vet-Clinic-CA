public class Staff {
	
	private String name;
	private String surname;
	private int staffNumber;
	private double salaryLevel;
//	private boolean medical;
//	private boolean admin;
	
	public Staff() {
		
	}
		
	
//	public Staff(String name, String surname, int staffNumber, double salaryLevel, boolean medical, boolean admin) {
//		super();
//		this.name = name;
//		this.surname = surname;
//		this.staffNumber = staffNumber;
//		this.salaryLevel = salaryLevel;
//		this.medical = medical;
//		this.admin = admin;
//	}



	public Staff(String name, String surname, int staffNumber, double salaryLevel) {
		super();
		this.name = name;
		this.surname = surname;
		this.staffNumber = staffNumber;
		this.salaryLevel = salaryLevel;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
		
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
	
	/**public boolean isMedical() {
		return medical;
	}

	public void setMedical(boolean medical) {
		this.medical = medical;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}*/

	@Override
	public String toString() {
		return "Staff Number: "+staffNumber
				+"\nStaff Name: "+name+ " "+surname
				+"\nSalary: "+salaryLevel
				/**+"\nSalary: "+medical
				+"\nSalary: "+admin*/
				+"\n-----------------------------------";
	}	
	
	

}
