package practice.interviewpreparationkit.sorting;

public class Comparator {

	public static int compare(Player a, Player b) {
		int result = 0;
		if (a.score < b.score) {
			result = 1;
		} else if (a.score > b.score) {
			result = -1;
		}
		if (result == 0) {
			result = a.name.compareTo(b.name);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(compare(new Player("amy", 100), new Player("aleksa", 150)));
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
