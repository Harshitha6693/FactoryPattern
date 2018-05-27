package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class BreadFactory {

	enum BreadCriteria{
		BAGEL, DONUT
	}
	
	private BreadFactory(){
}
	
	public static Item getObject(BreadCriteria criteria) {
		Item obj = null;
		if(criteria == BreadCriteria.BAGEL) {
			obj = new Bagel();
		}
		else if(criteria == BreadCriteria.DONUT) {
			obj = new Donut();
		}
		return obj;
	}
	
	public static Item getObject(BreadCriteria criteria, int ID, String nameOfBread, double price, String flavour) {
		Item obj = null;
		if(criteria == BreadCriteria.BAGEL) {
			obj = new Bagel(price,nameOfBread, ID,flavour);
		}
		else if(criteria == BreadCriteria.DONUT) {
			obj = new Donut(price,nameOfBread, ID,flavour);
		}
		return obj;
	}
	
	public static void demo() {
		Item I1 = BreadFactory.getObject(BreadCriteria.BAGEL,1,"white", 3.00, "caramel");
		Item I2 = BreadFactory.getObject(BreadCriteria.BAGEL,2,"brown", 5.00, "cinnamon");
		Item I3 = BreadFactory.getObject(BreadCriteria.BAGEL,3,"red", 6.00, "chocolate");
		Item I4 = BreadFactory.getObject(BreadCriteria.BAGEL);
		List<Item> bagel = new ArrayList<>();
		bagel.add(I1);
		bagel.add(I2);
		bagel.add(I3);
		bagel.add(I4);
		
		Item T1 = BreadFactory.getObject(BreadCriteria.DONUT,1,"green", 7.00, "mint");
		Item T2 = BreadFactory.getObject(BreadCriteria.DONUT,2,"pink", 9.00, "strawberry");
		Item T3 = BreadFactory.getObject(BreadCriteria.DONUT,3,"yellow", 8.00, "mango");
		List<Item> donut = new ArrayList<>();
		donut.add(T1);
		donut.add(T2);
		donut.add(T3);
		for(Item list : bagel) {
			list.show();
		}
		for(Item list: donut) {
			list.show();
		}
	}

		public static void main(String[] args) {
			BreadFactory.demo();
		}
	}
	

