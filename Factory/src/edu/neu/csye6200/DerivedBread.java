package edu.neu.csye6200;

public class DerivedBread extends AbstractItem{
	private int ID;
	private String typeOfBread;
	private double cost;
	
	public DerivedBread() {
		super();
		this.ID = 10;
		this.typeOfBread = "Continental";
		this.cost = 6.00;
	}

	public DerivedBread(int iD, String typeOfBread, double cost) {
		super();
		ID = iD;
		this.typeOfBread = typeOfBread;
		this.cost = cost;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTypeOfBread() {
		return typeOfBread;
	}

	public void setTypeOfBread(String typeOfBread) {
		this.typeOfBread = typeOfBread;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("This bread is ").append(this.getTypeOfBread()).append(" Id: ").append(this.getID());
		info.append(" costs ").append(this.getCost());
		return info.toString();
	}
	@Override
	public void show() {
		System.out.println(this.toString());
	}
	
}
