package practice.interviewpreparationkit.arrays;

/**
 * New Year Chaos
 * @see https://www.hackerrank.com/challenges/new-year-chaos/problem
 * @author edfrota
 *
 */
public class NewYearChaos {
	static int lastNumberIndex(int[] q, int lastNumber) {
		for (int i = lastNumber - 1; i >= 0; i--) {
			if (q[i] == lastNumber) {
				return i;
			}
		}
		return -1;
	}

	static void minimumBribes(int[] q, int lastNumber, int brides) {
		int lastNumberIndex = lastNumberIndex(q, lastNumber);
		int currentBrides = lastNumber - 1 - lastNumberIndex;
		brides += currentBrides;

		if (currentBrides > 2) {
			System.out.println("Too chaotic");
		} else if (lastNumber != 0) {
			if (currentBrides == 1) {
				q[lastNumberIndex] = q[lastNumberIndex + 1];
				q[lastNumberIndex + 1] = lastNumber;
			} else if (currentBrides == 2) {
				q[lastNumberIndex] = q[lastNumberIndex + 1];
				q[lastNumberIndex + 1] = q[lastNumberIndex + 2];
				q[lastNumberIndex + 2] = lastNumber;
			}
			minimumBribes(q, --lastNumber, brides);
		} else {
			System.out.println(brides);
		}
	}

	static void minimumBribes(int[] q) {
		minimumBribes(q, q.length, 0);
	}
	
	public static void main(String[] args) {
		int[] q = new int[]{2, 1, 5, 3, 4};
		minimumBribes(q);
	}
}
