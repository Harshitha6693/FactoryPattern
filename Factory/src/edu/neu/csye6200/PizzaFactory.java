package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;


public class PizzaFactory {

	enum PizzaCriteria{
		PIZZA, PIZZASLICE;
	}
	
	private PizzaFactory(){
	}
	
	private static AbstractItem getObject(PizzaCriteria criteria) {
		AbstractItem obj = null;
		if(criteria == PizzaCriteria.PIZZA) {
			obj = new Pizza();
		}
		else if(criteria == PizzaCriteria.PIZZASLICE) {
			obj = new PizzaSlice();
		}
		return obj;
	}
	
	private static AbstractItem getObject(PizzaCriteria criteria,int ID, String typeOfBread, double cost, int number) {
		AbstractItem obj = null;
		if(criteria == PizzaCriteria.PIZZA) {
			obj = new Pizza(ID, typeOfBread, cost, number);
		}
		else if(criteria == PizzaCriteria.PIZZASLICE) {
			obj = new PizzaSlice(ID,typeOfBread, cost, number);
		}
		return obj;
	}
	
	public void demo() {
		AbstractItem I1 = PizzaFactory.getObject(PizzaCriteria.PIZZA, 1, "white", 3.0, 4);
		AbstractItem I2 = PizzaFactory.getObject(PizzaCriteria.PIZZA, 2, "cream", 2.0, 6);
		AbstractItem I3 = PizzaFactory.getObject(PizzaCriteria.PIZZA, 3, "brown", 4.0, 2);
		
		List<AbstractItem> list = new ArrayList<>();
		list.add(I1);
		list.add(I2);
		list.add(I3);
		
		AbstractItem T1 = PizzaFactory.getObject(PizzaCriteria.PIZZASLICE, 1, "white", 2.0, 8);
		AbstractItem T2 = PizzaFactory.getObject(PizzaCriteria.PIZZASLICE, 2, "white", 5.0, 1);
		AbstractItem T3 = PizzaFactory.getObject(PizzaCriteria.PIZZASLICE, 3, "white", 3.0, 3);

		List<AbstractItem> list1 = new ArrayList<>();
		list1.add(T1);
		list1.add(T2);
		list1.add(T3);
		
		list.forEach(System.out::println);
		list1.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		PizzaFactory obj = new PizzaFactory();
		obj.demo();
	}
}
