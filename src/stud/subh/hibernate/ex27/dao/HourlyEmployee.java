package stud.subh.hibernate.ex27.dao;

import java.io.Serializable;

public class HourlyEmployee extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int workedHour;
	private int costPerHour;
	
	public int getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(int costPerHour) {
		this.costPerHour = costPerHour;
	}
	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}
	public int getWorkedHour() {
		return workedHour;
	}
}