package codewars.java.decode.the.morse.code.advanced;

import java.util.ArrayList;
import java.util.List;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        bits = bits.replaceAll("^0+|0+$", "");

        if (bits.isEmpty()) {
            return "";
        }

        List<Integer> groups = new ArrayList<>();

        int count = 1;

        for (int i = 1; i < bits.length(); i++) {
            if (bits.charAt(i) == bits.charAt(i - 1)) {
                count++;
            } else {
                groups.add(count);
                count = 1;
            }
        }

        groups.add(count);

        int timeUnit = groups.get(0);

        for (int group : groups) {
            timeUnit = gcd(timeUnit, group);
        }

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < bits.length()) {
            char current = bits.charAt(i);
            int length = 0;

            while (i < bits.length() && bits.charAt(i) == current) {
                length++;
                i++;
            }

            int units = length / timeUnit;

            if (current == '1') {
                if (units >= 3) {
                    result.append("-");
                } else {
                    result.append(".");
                }
            } else {
                if (units >= 7) {
                    result.append("   ");
                } else if (units >= 3) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }

    public static String decodeMorse(String morseCode) {
        morseCode = morseCode.trim();

        if (morseCode.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        String[] words = morseCode.split(" {3}");

        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split(" ");

            for (String letter : letters) {
                result.append(MorseCode.get(letter));
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}