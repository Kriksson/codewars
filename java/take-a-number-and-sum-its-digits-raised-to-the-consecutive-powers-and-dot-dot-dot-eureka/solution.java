package codewars.java.take.a.number.and.sum.its.digits.raised.to.the.consecutive.powers.and.dot.dot.dot.eureka;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> answer = new ArrayList<>();
        for (long number = a; number <= b; number++) {
            char[] digits = String.valueOf(number).toCharArray();
            long sum = 0;
            for (int j = 0; j < digits.length; j++) {
                int digit = digits[j] - '0';
                int plus = (int) Math.pow(digit, j+1);
                sum = sum + plus;
            }
            if (sum == number) {
                answer.add(number);
            };
        }
        return answer;
    }
}