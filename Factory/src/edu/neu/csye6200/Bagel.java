package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bagel extends Bread implements Comparable<Bagel>{
	private String flavour;

	public Bagel() {
		super();
		this.flavour = "Vanilla";
	}

	public Bagel(double price, String nameOfBread, int iD, String flavour) {
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
/**
 * Comparable sorting
 */
	@Override
	public int compareTo(Bagel o) {
		// TODO Auto-generated method stub
		return this.getNameOfBread().compareTo(o.getNameOfBread());
	}
	
	public static void main(String[] args) {
		List<Bagel> bagels = new ArrayList<>();
		bagels.add(new Bagel(8.0,"white", 1,"strawberry"));
		bagels.add(new Bagel(5.0,"cream", 2,"caramel"));
		bagels.add(new Bagel(7.0,"pink", 3,"blueberry"));
		Collections.sort(bagels);
		bagels.forEach(System.out::println);
		bagels.sort(null);// natural order
		/**
		 * Comparator sorting
		 */
		bagels.sort(new Comparator<Bagel>() {

			@Override
			public int compare(Bagel o1, Bagel o2) {
				// TODO Auto-generated method stub
				return o1.getFlavour().compareToIgnoreCase(o2.getFlavour());
			}
		});
		bagels.forEach(System.out::println);
	}
	
	
	
}
