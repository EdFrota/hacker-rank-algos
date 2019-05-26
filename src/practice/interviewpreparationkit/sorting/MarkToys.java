package practice.interviewpreparationkit.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Mark and Toys
 * @see https://www.hackerrank.com/challenges/mark-and-toys/problem
 * @author edfrota
 *
 */
public class MarkToys {
	static int maximumToys(int[] prices, int k) {
        int maxNumber = 0;
        
        List<Integer> cleanPrices = new ArrayList<>();
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= k) {
                cleanPrices.add(prices[i]);
            }
        }
        cleanPrices.sort(Comparator.naturalOrder());
        
        int price;
        for (int i = 0; i < cleanPrices.size(); i++) {
            price = cleanPrices.get(i);
            if (price <= k) {
                k -= price;
                maxNumber++;
            } else {
                break;
            }
        }
        return maxNumber;
    }
	
	public static void main(String[] args) {
		System.out.println(maximumToys(new int[] {1, 12, 5, 111, 200, 1000, 10}, 50));
	}
}
