package com.blc.elc;

public class ProductMain {

	public static void main(String[] args) {
		Product prod= new Product();
		prod.setProductDetails("Laptop", 501,75000.0);
		System.out.println(prod.getProductDetails());
	}

}
