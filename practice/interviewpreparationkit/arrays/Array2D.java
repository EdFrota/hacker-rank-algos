package practice.interviewpreparationkit.arrays;

/**
 * 2D Array - DS
 * @see https://www.hackerrank.com/challenges/2d-array/problem
 * @author edfrota
 *
 */
public class Array2D {
	static int hourglassSum(int[][] arr) {
		int r = Integer.MIN_VALUE;

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				int val = arr[i][j];
				int posi = i - 1;
				int posj = j - 1;

				val += arr[posi][posj];
				val += arr[posi][posj + 1];
				val += arr[posi][posj + 2];

				val += arr[posi + 2][posj];
				val += arr[posi + 2][posj + 1];
				val += arr[posi + 2][posj + 2];

				if (val > r) {
					r = val;
				}
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		arr[0][0] = 0; arr[0][1] = 1; arr[0][2] = 0; arr[0][3] = 0; arr[0][4] = 0; arr[0][5] = 0;
		arr[1][0] = 1; arr[1][1] = 1; arr[1][2] = 1; arr[1][3] = 0; arr[1][4] = 0; arr[1][5] = 0;
		arr[2][0] = 0; arr[2][1] = 0; arr[2][2] = 2; arr[2][3] = 4; arr[2][4] = 4; arr[2][5] = 0;
		arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 0; arr[3][3] = 2; arr[3][4] = 0; arr[3][5] = 0;
		arr[4][0] = 0; arr[4][1] = 0; arr[4][2] = 1; arr[4][3] = 2; arr[4][4] = 4; arr[4][5] = 0;

		System.out.println(hourglassSum(arr));
	}
}
