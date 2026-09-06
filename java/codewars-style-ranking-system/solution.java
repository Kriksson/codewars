package codewars.java.codewars.style.ranking.system;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int rank = -8;
    public int progress = 0;
    private final List<Integer> ranks = new ArrayList<>(List.of(-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8));

    public void incProgress(int rank) {
        if (!ranks.contains(rank)) {
            throw new IllegalArgumentException("Невалидный ранг " + rank);
        }
        if (!(this.rank == 8)) {
            int d = getDiff(this.rank, rank);
            if (this.rank == rank) {
                progress += 3;
            } else if (d == -1) {
                progress += 1;
            } else if (d <= -2) {
            } else {
                this.progress += (10 * d * d);
            }
            while (this.progress >= 100) {
                this.rank += 1;
                if (this.rank == 0) {
                    this.rank++;
                }
                this.progress -= 100;
            }
            if (this.rank >= 8) {
                this.rank = 8;
                this.progress = 0;
            }
        }
    }
    int getDiff(int rank1, int rank2) {
        return ranks.indexOf(rank2)- ranks.indexOf(rank1);
    }
}
