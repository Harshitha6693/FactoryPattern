package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pizza extends DerivedBread implements Comparable<Pizza>{
	private Integer pizzaOrdered;

	public Pizza() {
		super();
		this.pizzaOrdered = 10;
	}

	public Pizza(int iD, String typeOfBread, double cost, Integer pizzaOrdered) {
		super(iD, typeOfBread, cost);
		this.pizzaOrdered = pizzaOrdered;
	}

	public Integer getPizzaOrdered() {
		return pizzaOrdered;
	}

	public void setPizzaOrdered(Integer pizzaOrdered) {
		this.pizzaOrdered = pizzaOrdered;
	}

	@Override

	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("This bread is ").append(this.getTypeOfBread()).append(" Id: ").append(this.getID());
		info.append(" costs ").append(this.getCost());
		info.append(" Total Pizzas Ordered: ").append(this.getPizzaOrdered());
		return info.toString();
	}

	@Override
	public int compareTo(Pizza o1) {
		// TODO Auto-generated method stub
		return  this.getPizzaOrdered().compareTo(o1.getPizzaOrdered());
	}
	
	public static void main(String[] args) {
	List<Pizza> list = new ArrayList<>();
	list.add(new Pizza(1, "white", 2.0, 3));
	list.add(new Pizza(2, "brown", 3.0, 8));
	list.add(new Pizza(3, "red", 4.0, 1));
	list.sort(null);//natural order comparable
	list.forEach(System.out::println);
	list.sort(new Comparator<Pizza>() {

		@Override
		public int compare(Pizza o1, Pizza o2) {
			// TODO Auto-generated method stub
			return o2.getTypeOfBread().compareToIgnoreCase(o1.getTypeOfBread());
		}
	});
	list.forEach(System.out::println);//using comparator
	
}
}