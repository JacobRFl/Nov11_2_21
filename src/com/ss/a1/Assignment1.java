/**
 * 
 */
package com.ss.a1;

/**
 * @author Jacob
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		try {
			for (String s : args) {
				sum += Integer.parseInt(s);
//				System.out.println("running sum: " + sum);
			}
			System.out.println("final sum: " + sum);
		} catch (Exception e) {
			System.out.println("Please only use whole numbers");
		}
	}

}
