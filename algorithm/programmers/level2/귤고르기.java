package algorithm.programmers.level2;

import java.util.*;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        int[] arrays = map.values().stream().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        for (int i = 0; i < arrays.length; i++) {
            answer++;
            k -= arrays[i];
            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
    

    public static void main(String[] args) {
        귤고르기 g = new 귤고르기();
        int[] arr = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(g.solution(6, arr));
    }
}
