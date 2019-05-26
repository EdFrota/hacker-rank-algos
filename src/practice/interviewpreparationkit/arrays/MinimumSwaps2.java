package practice.interviewpreparationkit.arrays;

/**
 * Minimum Swaps 2
 * @see https://www.hackerrank.com/challenges/minimum-swaps-2/problem
 * @author edmundofrota
 *
 */
public class MinimumSwaps2 {

	static int minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length;) {
			if (i + 1 != arr[i]) {
				int val = arr[i];
				arr[i] = arr[val - 1];
				arr[val - 1] = val;
				count++;
			}
			if (i + 1 == arr[i]) {
				i++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};
		System.out.println(minimumSwaps(arr));
	}
}
