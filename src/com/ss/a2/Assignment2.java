/**
 * 
 */
package com.ss.a2;

/**
 * @author kevaf
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] twoD = { { 1, 6, 8 }, { 32, 67, 98 }, { 2, 8, 27 } };

		// initialize to negative 1 assuming all values are positive
		int maxValue = -1;

		int maxX = -1;
		int maxY = -1;

		int currY = 0;
		int currX;
		for (int[] oneD : twoD) {
			currX = 0;
			for (int value : oneD) {
				if (value > maxValue) {
					maxValue = value;
					maxX = currX;
					maxY = currY;
				}
				currX++;
			}

			currY++;
		}

		System.out.println(maxValue + " x: " + maxX + " y: " + maxY);

	}

}
