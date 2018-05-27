package edu.neu.csye6200;

public class PizzaSlice extends DerivedBread{
	private int totalSlicesOrdered;

	public PizzaSlice() {
		super();
		this.totalSlicesOrdered = 10;
	}

	public PizzaSlice(int iD, String typeOfBread, double cost, int totalSlicesOrdered) {
		super(iD, typeOfBread, cost);
		this.totalSlicesOrdered = totalSlicesOrdered;
	}

	public int getTotalSlicesOrdered() {
		return totalSlicesOrdered;
	}

	public void setTotalSlicesOrdered(int totalSlicesOrdered) {
		this.totalSlicesOrdered = totalSlicesOrdered;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("This bread is ").append(this.getTypeOfBread()).append(" Id: ").append(this.getID());
		info.append(" costs ").append(this.getCost());
		info.append(" Total PizzaSlices Ordered: ").append(this.getTotalSlicesOrdered());
		return info.toString();	}

}
