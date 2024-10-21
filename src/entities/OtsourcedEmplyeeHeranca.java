package entities;

public class OtsourcedEmplyeeHeranca extends EmployeeHeranca {
	private Double additionalCharge;

	
	public OtsourcedEmplyeeHeranca() {
		super();
	}
	
	public OtsourcedEmplyeeHeranca(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		// TODO Auto-generated method stub
		return super.payment() + additionalCharge * 1.1; 
	}


}