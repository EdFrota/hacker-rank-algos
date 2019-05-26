package practice.interviewpreparationkit.dictionarieshashmaps;

/**
 * Two Strings
 * @see https://www.hackerrank.com/challenges/two-strings/problem
 * @author edfrota
 *
 */
public class TwoStrings {
	static String twoStrings(String s1, String s2) {
		char[] p = new char[] { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'x', 'z', 'y', 'w' };

		char[] charArrS1 = s1.toCharArray();
		char[] charArrS2 = s2.toCharArray();

		int[] intArrS1 = new int[p.length];
		int[] intArrS2 = new int[p.length];

		int maxLength = charArrS1.length > charArrS2.length ? charArrS1.length : charArrS2.length;

		for (int j = 0; j < p.length; j++) {
			if (intArrS1[j] == 0 || intArrS2[j] == 0) {
				for (int i = 0; i < maxLength; i++) {
					if (i + 1 < charArrS1.length && intArrS1[j] == 0 && charArrS1[i] == p[j]) {
						intArrS1[j] = 1;
					}
					if (i + 1 < charArrS2.length && intArrS2[j] == 0 && charArrS2[i] == p[j]) {
						intArrS2[j] = 1;
					}
				}
			}
		}

		for (int i = 0; i < intArrS1.length; i++) {
			if (intArrS1[i] != 0 && intArrS2[i] != 0) {
				return "YES";
			}
		}

		return "NO";
	}
	
	public static void main(String[] args) {
		System.out.println(twoStrings("hello", "world"));
	}
}
