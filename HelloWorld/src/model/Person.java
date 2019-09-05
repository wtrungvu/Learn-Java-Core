/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package model;

public abstract class Person { // Abstract Class
	public abstract void move(); // Abstract method

	public void study() { // Non-abstract method
		System.out.println("Study"); 
	}
}
