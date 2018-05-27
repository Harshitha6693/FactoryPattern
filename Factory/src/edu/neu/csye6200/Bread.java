package edu.neu.csye6200;

public class Bread extends Item{
	private double price;
	private String nameOfBread;
	private int ID;
	
	public Bread() {
		super();
		this.price = 5.0;
		this.nameOfBread = "Indian";
		this.ID = 1;
	}

	public Bread(double price, String nameOfBread, int iD) {
		super();
		this.price = price;
		this.nameOfBread = nameOfBread;
		ID = iD;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameOfBread() {
		return nameOfBread;
	}

	public void setNameOfBread(String nameOfBread) {
		this.nameOfBread = nameOfBread;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Item: ");
		info.append(this.getClass());
		info.append(" ").append(this.getNameOfBread());
		info.append(", cost: ").append(this.getPrice());
		info.append(", id: ").append(this.getID());
		return info.toString();	
	}
	
	@Override
	public void show(){
			System.out.println(this.toString());
		}
}
