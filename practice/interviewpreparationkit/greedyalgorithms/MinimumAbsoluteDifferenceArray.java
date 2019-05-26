package practice.interviewpreparationkit.greedyalgorithms;

public class MinimumAbsoluteDifferenceArray {

	
	static int minimumAbsoluteDifference2(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		int[][] matrix = new int[arr.length][arr.length];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			matrix[i][i] = arr[i];
			
			
			
		}
		
		return min;
	}
	
	static int minimumAbsoluteDifference(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i != j) {
					int calc = Math.abs(arr[i] - arr[j]);
					if (min > calc) {
						min = calc;
						if (min == 1) {
							return min;
						}
					}
				}
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
//		int [] arr = new int[]{-2, 2, 4};
//		int [] arr = new int[]{3, -7, 0};
//		int [] arr = new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		int [] arr = new int[]{1, -3, 71, 68, 17};
		
		long init = System.currentTimeMillis();
		System.out.println(minimumAbsoluteDifference(arr));
		System.out.println("TIME::" + (System.currentTimeMillis() - init));
	}
}
