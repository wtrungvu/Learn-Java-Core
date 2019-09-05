/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package test;

import cars.Cars;
import cars.Ford;
import cars.Toyota;

public class Main {
	public static void main(String[] args) {
		Cars ford = new Ford();
		ford.getBrand();
		ford.getPower();
		ford.getPrice();

		Toyota toyota = new Toyota();
		toyota.getBrand();
		toyota.getPower();
		toyota.getPrice();
	}
}
