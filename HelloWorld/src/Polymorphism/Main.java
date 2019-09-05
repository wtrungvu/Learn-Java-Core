/* =======================================================
 * (C) Copyright 2019 by Trung Vu. All Rights Reserved.
 *
 * @author Asus
 * @date Sep 5, 2019
 * @version 1.0
 *
 * ======================================================= */
package Polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.show(); // hiển thị dòng "Đây là phương thức show() của lớp Shape"

		// bản chất của shape là Shape, nhưng vì khai báo Rectangle nên chúng ta chỉ
		// nhìn thấy những gì mà Rectangle có
		// vì vậy sẽ chạy những hàm của Rectangle
		shape = new Reactangle();
		shape.show(); // hiển thị dòng "Đây là phương thức show() của lớp Rectangle"

		// tương tự lúc này shape sẽ đóng vai trò là 1 Square
		shape = new Square();
		shape.show(); // hiển thị dòng "Đây là phương thức show() của lớp Square"
	}

}
