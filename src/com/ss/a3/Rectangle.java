/**
 * 
 */
package com.ss.a3;

/**
 * @author Jacob
 *
 */
public class Rectangle implements Shape {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length =length;
		this.width = width;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area: "+length*width);
	}

	@Override
	public void display() {
		System.out.println("Length:"+ length);
		System.out.println("Width:"+ width);
		calculateArea();

	}


}
