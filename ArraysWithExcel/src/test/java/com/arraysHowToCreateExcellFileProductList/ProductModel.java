package com.arraysHowToCreateExcellFileProductList;

import java.util.ArrayList;

import java.util.List;

public class ProductModel {

	
	public List<Product> findAll(){
		try {
		
			List<Product>result = new ArrayList<Product>();
			result.add(new Product("1001", "Chocklet", 1000, 4, "2014/02/14"));
			result.add(new Product("1002", "Flower",   2000, 3, "2014/02/14"));
			result.add(new Product("1003", "Perfume", 3000, 2, "2014/02/14"));
			result.add(new Product("1004", "Dinner", 4000, 1, "2014/02/14"));
			
			// if you create new object, then must change:
			//     range of region  and range of total at sub total column 
			result.add(new Product("1005", "Lunch", 5000, 1, "2014/02/14"));
		
			return result;
		} catch (Exception e) {
			return null;
		}
	}
}
