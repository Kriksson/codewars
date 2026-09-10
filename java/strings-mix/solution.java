package codewars.java.strings.mix;

import java.util.*;

public class Mixing {

    public static String mix(String s1, String s2) {
        TreeMap<String, Integer> arr1 = new TreeMap<>();
        TreeMap<String, Integer> arr2 = new TreeMap<>();
        
        s1.chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .forEach(c -> arr1.put(String.valueOf((char)c), arr1.getOrDefault(String.valueOf((char)c), 0) + 1));

        s2.chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .forEach(c -> arr2.put(String.valueOf((char)c), arr2.getOrDefault(String.valueOf((char)c), 0) + 1));

        arr1.entrySet().removeIf(n -> n.getValue() <= 1);
        arr2.entrySet().removeIf(n -> n.getValue() <= 1);

        List<String> subResults = new ArrayList<>();
        Set<String> allKeys = new HashSet<>();

        allKeys.addAll(arr1.keySet());
        allKeys.addAll(arr2.keySet());

        for (String key : allKeys) {
            int count1 = arr1.getOrDefault(key, 0);
            int count2 = arr2.getOrDefault(key, 0);
            int maxCount = Math.max(count1, count2);

            String prefix;
            if (count1 > count2) {
                prefix = "1:";
            } else if (count1 < count2) {
                prefix = "2:";
            } else {
                prefix = "=:";
            }
            String n = prefix + key.repeat(maxCount);
            subResults.add(n);
        }
        subResults.sort((a, b) -> {
            int lenCompare = Integer.compare(b.length(), a.length());
            if (lenCompare != 0) return lenCompare;

            int prefixCompare = a.substring(0, 2).compareTo(b.substring(0, 2));
            if (prefixCompare != 0) return prefixCompare;

            return a.substring(2).compareTo(b.substring(2));
        });

        return String.join("/", subResults);
    }
}
