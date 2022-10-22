package algorithm.programmers.fullSearch;

import java.util.Arrays;

public class MinSquare {
    public int solution(int[][] sizes) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if (a < sizes[i][0]) a = sizes[i][0];
            if (b < sizes[i][1]) b = sizes[i][1];
        }

        return a*b;
    }

    public static void main(String[] args) {
        MinSquare M = new MinSquare();
        System.out.println(M.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
