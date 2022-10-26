/*
 Name - Subham Amin.
 Product Base Shorting System.
 */

package com.ProductArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Products> p1 = new ArrayList<>();
		p1.add(new Products("WashingMachine", 20000, 1));
		p1.add(new Products("Fridge", 18000, 1));
		p1.add(new Products("AirCondition", 32000, 1));
		p1.add(new Products("Cooler", 6000, 1));
		p1.add(new Products("Fan", 2000, 1));
		p1.add(new Products("LED TV", 12000, 1));

		Collections.sort(p1);
		for (Products p : p1) {
			System.out.println(p);
		}

	}

}
