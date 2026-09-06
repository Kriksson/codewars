package codewars.java.take.a.number.and.sum.its.digits.raised.to.the.consecutive.powers.and.dot.dot.dot.eureka;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> answer = new ArrayList<>();
        for (int i = (int) a; i <= (int) b; i++) {
            char[] nums = String.valueOf(i).toCharArray();
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {;
                int num = Integer.parseInt(String.valueOf(nums[j]));
                int plus = (int) Math.pow(num, j+1);
                sum = sum + plus;
            }
            if (sum == i) {
                answer.add((long) i);
            };
        }
        return answer;
    }
}