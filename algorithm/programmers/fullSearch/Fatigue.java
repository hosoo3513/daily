package algorithm.programmers.fullSearch;

import java.util.Arrays;
import java.util.Comparator;

public class Fatigue {
    public int answer = 0;
    public boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

    public static void main(String[] args) {
        Fatigue F = new Fatigue();
        int[][] arr = new int[][]{{30, 10}, {50, 40}, {80, 20}};
        System.out.println(F.solution(80, arr));
    }

    /**
     * 열심히 해보았지만 실패..
     * 두 차이값으로 정렬한 뒤 하면 될 것 같은데 왜 안될까
     */
    public int solution2(int k, int[][] dungeons) {
        int answer = 0;

        Arrays.sort(dungeons, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o2[0] - o2[1]) - (o1[0] - o1[1]);
            }
        });

        int fat = k;

        for (int i = 0; i < dungeons.length; i++) {
            if (fat >= dungeons[i][1]) {
                fat -= dungeons[i][1];
                answer++;
            }
        }

        return answer;
    }
}
