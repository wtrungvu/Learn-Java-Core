/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package model;

public class Manager {
	private String name;

	public void report(Employee employee) {
		System.out.println(employee.name);
	}
}
