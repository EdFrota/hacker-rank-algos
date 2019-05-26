package practice.interviewpreparationkit.arrays;

import java.util.Arrays;

/**
 * Arrays: Left Rotation
 * @see https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 * @author edfrota
 *
 */
public class LeftRotation {
	static int[] rotLeft(int[] a, int d) {
		int[] r = new int[a.length];
		int count = 0;
		for (int i = d; i < a.length; i++) {
			r[count++] = a[i];
		}

		for (int i = 0; i < d; i++) {
			r[count++] = a[i];
		}

		return r;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5};
		int d = 5;
		int[] r = rotLeft(a, d);
		System.out.println(Arrays.toString(r));
	}
}
