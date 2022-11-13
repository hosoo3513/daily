package algorithm.programmers.greedy;

import java.util.Arrays;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        boolean[] visit = new boolean[reserve.length];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    cnt++;
                    visit[j] = true;
                    break;
                }
            }
        }


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (visit[j] == false && (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1)) {
                    visit[j] = true;
                    cnt++;
                    break;
                }
            }
        }

        int no = lost.length - cnt;

        return n - no;
    }

}
