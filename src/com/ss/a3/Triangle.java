/**
 * 
 */
package com.ss.a3;

/**
 * @author Jacob			
 *
 */
public class Triangle implements Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area: "+height*base/2);


	}

	@Override
	public void display() {
		System.out.println("Height:"+ height);
		System.out.println("Base:"+ base);
		calculateArea();

	}

}
