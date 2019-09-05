/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package demo_wrapper_class;

public class WrapperClass {

	public static void main(String[] args) {
		int year = 2019; // primitive data
		Integer number = year; // Wrapper Class
		System.out.println(number);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		String str = "2017";
		System.out.println(Integer.parseInt(str));

		System.out.println(Integer.MAX_VALUE);
		long l = Integer.MAX_VALUE + 1;
		System.out.println(l);

		long l2 = Integer.MAX_VALUE + (long) 1;
		System.out.println(l2);
	}

}
