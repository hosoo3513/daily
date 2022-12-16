package algorithm.programmers.level2;

import java.util.*;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        sortByValue(map);

        int a = 0;

        while (k>0) {
            answer++;
            k = k - map.;
            a++;
        }

        return answer;
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());

        // 오름차순
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Integer, Integer> tmp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            tmp.put(aa.getKey(), aa.getValue());
        }

        return tmp;
    }

    public static void main(String[] args) {
        귤고르기 g = new 귤고르기();
        int[] arr = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(g.solution(6, arr));
    }
}
