
public class MedicalStaff extends Staff{
	
	private String type;

	public MedicalStaff() {
		
	}
	
	public MedicalStaff(String type) {
		super();
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
