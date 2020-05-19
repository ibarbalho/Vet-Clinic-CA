
public class Animals {
	
	private String type;
	private String name;
	private int age;
	private int medicalCondition;
		
	public Animals() {
		
	}

	public Animals(String type, String name, int age, int medicalCondition) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMedicalCondition() {
		return medicalCondition;
	}
	
	public void setMedicalCondition(int medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	
}
