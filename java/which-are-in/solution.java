package codewars.java.which.are.in;

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
	
	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> returnableWords = new TreeSet<>();
		for (String word : array2) {
			for (String word2 : array1) {
				if (word.contains(word2)) {
					returnableWords.add(word2);
				}
			}
		}
		return returnableWords.toArray(new String[0]);
	}
}
