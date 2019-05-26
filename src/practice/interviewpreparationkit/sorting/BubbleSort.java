package practice.interviewpreparationkit.sorting;

/**
 * Sorting: Bubble Sort
 * @see https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
 * @author edfrota
 *
 */
public class BubbleSort {
	static void countSwaps(int[] a) {
		int swap = 0;
		int aux = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					aux = a[j];
					a[j] = a[i];
					a[i] = aux;
					swap++;
				}
			}
		}
		System.out.println(String.format("Array is sorted in %s swaps.", swap));
		System.out.println(String.format("First Element: %s", a[0]));
		System.out.println(String.format("Last Element: %s", a[a.length - 1]));
	}
	
	public static void main(String[] args) {
		countSwaps(new int[] {3, 2, 1});
	}
}
