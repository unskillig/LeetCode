import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Run {

	private static Map<Character, Integer> charCount = new HashMap<Character, Integer>();
	// Priority-Queue mit Custom-Comparator basierend auf den Values der Keys in der Map --> Ansonsten würde die Standard-Reihenfolge des Einfügens genommen werden
	private static PriorityQueue<Character> chars = new PriorityQueue<>((a, b) -> charCount.get(b) - charCount.get(a));
	private static StringBuilder result = new StringBuilder();

	public static void main(String[] args) {

		String test1 = "tree";
		String test2 = "aaaccc";
		String test3 = "Aabb";

		countCharacters(test1);
		putInQueue();
		System.out.println(result);

	}

	private static void countCharacters(String test) {
		for (char c : test.toCharArray()) {
			// falls noch kein Wert vorhanden, wird der default-wert 0 gesetzt
			// und direkt danach um 1 hochgezählt;
			// falls Wert vorhanden, wird der vorhandene Wert um 1 hochgezählt
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
	}

	private static void putInQueue() {
		// Für jeden Wert in der map, diesen an die entsprechende Stelle in der
		// Queue geben
		for (char c : charCount.keySet()) {
			chars.add(c);
		}

		while (!chars.isEmpty()) {
			char current = chars.remove();
			if (charCount.get(current) > 1) {
				for (int i = 0; i < charCount.get(current); i++) {
					result.append(current);
				}
			} else {
				result.append(current);
			}
		}
	}
}
