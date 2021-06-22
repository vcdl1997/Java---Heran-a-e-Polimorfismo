package entities;

public class Employee {
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() 
	{	
		return this.hours * this.valuePerHour;
	}

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
