/**
 * 
 */
package com.ss.a3;

/**
 * @author Jacob
 *
 */
public class Circle implements Shape {

	double radius;
	final double pi =3.14;
	
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area: "+radius*radius*pi);

	}

	@Override
	public void display() {
		System.out.println("Radius: "+radius);
		calculateArea();

	}

}
