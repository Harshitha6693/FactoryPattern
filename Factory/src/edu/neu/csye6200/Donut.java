package edu.neu.csye6200;

public class Donut extends Bread{
	private String flavour;

	public Donut() {
		super();
		this.flavour = "Chocolate";
	}

	public Donut(double price, String nameOfBread, int iD, String flavour) {
		super(price, nameOfBread, iD);
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(" ").append(this.getNameOfBread());
		info.append(", cost: ").append(this.getPrice());
		info.append(", id: ").append(this.getID()).append(" is a Bread having a flavor of").append(this.getFlavour());
		return info.toString();
	}

}
