/**
 * 
 */
package com.ss.a3;

/**
 * @author Jacob
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape rec = new Rectangle(15, 5);
		rec.display();
		Shape circle = new Circle(3);
		circle.display();
		Shape tri = new Triangle(3,4);
		tri.display();
	}

}
