/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package cars;

public class Ford implements Cars {

	@Override
	public void getBrand() {
		// TODO Auto-generated method stub
		System.out.println("Brand name: Ford");
	}

	@Override
	public void getPower() {
		// TODO Auto-generated method stub
		System.out.println("Power: Oil");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price: 5000 USD");
	}

}
