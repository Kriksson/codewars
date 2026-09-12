package codewars.java.alphabet.war;

public class Kata{
    public static String alphabetWar(String fight){
        char[] s = fight.toCharArray();
        int leftPower = 0;
        int rightPower =0;
        for (char c : s) {
            if (c == 'w') leftPower += 4;
            if (c == 'p') leftPower += 3;
            if (c == 'b') leftPower += 2;
            if (c == 's') leftPower += 1;
            if (c == 'm') rightPower += 4;
            if (c == 'q') rightPower += 3;
            if (c == 'd') rightPower += 2;
            if (c == 'z') rightPower +=1;
        }
        if (leftPower > rightPower) return "Left side wins!";
        if (rightPower > leftPower) return "Right side wins!";
        return "Let's fight again!";
    }
}