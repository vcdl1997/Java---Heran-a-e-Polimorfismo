package entities;

public class OutsourcedEmployee extends Employee{
	
	protected Double additionalCharge;
	
	public OutsourcedEmployee(
		String name, 
		Integer hours, 
		Double valuePerHour, 
		Double additionalCharge
	) {
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
	public final Double payment() 
	{	
		Double base = this.hours * this.valuePerHour;
		Double additional = this.additionalCharge * 10 / 100;
		return base + this.additionalCharge + additional;
	}

	@Override
	public String toString() 
	{
		StringBuilder report = new StringBuilder();
		
		return report
			.append(this.getName())
			.append(" - $ ")
			.append(String.format("%.2f", this.payment()))
			.toString();
	}
}
