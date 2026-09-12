package codewars.java.gcd.sum;

class GCDsum{
    public static int[] solve(int s, int g){
        if (s % g != 0) return new int[]{-1, -1};
        return new int[]{g, s-g};
    }
}