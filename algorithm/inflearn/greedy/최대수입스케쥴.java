package algorithm.inflearn.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 최대수입스케쥴 {

    public int solution(int num, int[][] arr) {

        int answer = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int max = arr[0][1];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int j=0;

        for (int i = max; i >= 1; i--) {
            for (; j < arr.length; j++) {
                if (arr[j][1] >= i) {
                    pq.add(arr[j][0]);
                } else {
                    break;
                }
            }

            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }


        return answer;

    }

    public static void main(String[] args){

        최대수입스케쥴 c = new 최대수입스케쥴();
        int num = 6;
        int[][] arr = new int[][]{{50, 2}, {20, 1}, {40, 2}, {60, 3}, {30, 3}, {30, 1}};

        System.out.println(c.solution(6, arr));
    }
}
