package practice.interviewpreparationkit.dictionarieshashmaps;

/**
 * Hash Tables: Ransom Note
 * 
 * @see https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 * @author edfrota
 *
 */
public class RansomNote {
	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		int[][] wordSizeIndex = new int[40][magazine.length];

		for (int i = 0; i < magazine.length; i++) {
			String word = magazine[i];
			wordSizeIndex[word.length()][i] = i;
		}

		int[] usedIndexes = new int[magazine.length];
		boolean r = true;
		for (int i = 0; i < note.length; i++) {
			String word = note[i];
			boolean found = false;
			int[] indexOfWord = wordSizeIndex[word.length()];
			for (int j = 0; j < indexOfWord.length; j++) {
				if (usedIndexes[indexOfWord[j]] == 0 && word.equals(magazine[indexOfWord[j]])) {
					usedIndexes[indexOfWord[j]] = 1;
					found = true;
					break;
				}
			}
			if (!found) {
				r = false;
				System.out.println("No");
				break;
			}
		}

		if (r) {
			System.out.println("Yes");
		}
	}
	
	public static void main(String[] args) {
		String[] magazine = "two times three is not four".split(" ");
		String[] note = "two times two is four".split(" ");
		checkMagazine(magazine, note);
	}
}
