package codewars.java.matrix.weight;

public class Solution {
    public static String thinOrFat(int[][] matrix) {
        double widths = 0;
        double heights = 0;
        for (int i = 0; i < matrix.length; i++) {
            int n = 0;
            int z = 0;
            for (int j = 0; j < matrix.length; j++) {
                n += matrix[i][j];
            }
            for (int j = 0; j < matrix.length; j++) {
                z += matrix[j][i];
            }
            widths += Math.sqrt(n);
            heights += Math.sqrt(z);
        }
        if (widths < heights) return "thin";
        if (widths > heights) return "fat";
        if (widths == heights) return "perfect";
        return null;
    }
}

// 1 3
// 5 7