package algorithm.programmers.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int tmp = 0;

        for (int i = 1; i < routes.length; i++) {
            if ((routes[tmp][1] > routes[i][1]) || (routes[tmp][1] < routes[i][0])) {
                tmp = i;
                answer++;
            }
        }

        return answer + 1;
    }

    public static void main(String[] args) {
        단속카메라 d = new 단속카메라();
        int[][] routes = new int[][]{{-20, -15}, {-15, -4}, {-14, -5}, {-18,  -13}, {-5, -3}, {-2, -1}};
        System.out.println(d.solution(routes));
    }
}
