/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package model;

public class Manager implements Member{
	private String name;

	public Manager() {
		System.out.println("Created");
	}

	public Manager(String name) {
		System.out.println("Created with name");
	}

	public void report(Employee employee) {
		System.out.println(employee.name);
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		
	}
}
