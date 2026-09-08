package codewars.java.parseint.reloaded;

import java.util.List;
import java.util.Map;

public class Parser {
    
    public static int parseInt(String numStr) {
        Map<String, Integer> numbers = Map.ofEntries(
                Map.entry("zero", 0),
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3),
                Map.entry("four", 4),
                Map.entry("five", 5),
                Map.entry("six", 6),
                Map.entry("seven", 7),
                Map.entry("eight", 8),
                Map.entry("nine", 9),
                Map.entry("ten", 10),
                Map.entry("eleven", 11),
                Map.entry("twelve", 12),
                Map.entry("thirteen", 13),
                Map.entry("fourteen", 14),
                Map.entry("fifteen", 15),
                Map.entry("sixteen", 16),
                Map.entry("seventeen", 17),
                Map.entry("eighteen", 18),
                Map.entry("nineteen", 19),
                Map.entry("twenty", 20),
                Map.entry("thirty", 30),
                Map.entry("forty", 40),
                Map.entry("fifty", 50),
                Map.entry("sixty", 60),
                Map.entry("seventy", 70),
                Map.entry("eighty", 80),
                Map.entry("ninety", 90)
        );
        numStr = numStr.replace("-", " ");
        int current = 0;
        int result = 0;
        List<String> nums = List.of(numStr.trim().split(" "));
        for (String num : nums) {
            if (numbers.get(num) != null) {
                current += numbers.get(num);
            } else if (num.equals("hundred")) {
                current *= 100;
            } else if (num.equals("thousand")) {
                current *= 1000;
                result = current;
                current = 0;
            } else if (num.equals("million")) {
                current *= 1000000;
            } else if (numbers.get(num) != null) {
                result += numbers.get(num);
            }
        }
        return current+result;
    }
}