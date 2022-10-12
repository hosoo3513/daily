package algorithm.programmers.hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 각 장르별로 몇번의 재생이 있었는지 hashMap에 넣는다
        HashMap<String, Integer> HM = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            HM.put(genres[i], HM.getOrDefault(genres[i], 0) + plays[i]);
        }

        HashMap<String, Integer> sortedHM = sortByValue(HM);

        ArrayList<Integer> list = new ArrayList<>();
        for (String str : sortedHM.keySet()) {
            int max = 0;
            int firstIdx = -1;
            for (int i = 0; i < genres.length; i++) {
                if (str.equals(genres[i]) && max < plays[i]) {
                    max = plays[i];
                    firstIdx = i;
                }
            }

            max = 0;
            int secondIdx = -1;
            for (int i = 0; i < genres.length; i++) {
                if (str.equals(genres[i]) && max < plays[i] && i != firstIdx) {
                    max = plays[i];
                    secondIdx = i;
                }
            }
            list.add(firstIdx);
            if (secondIdx >= 0) list.add(secondIdx);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // value 값 기준으로 정렬
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

        // 내림차순
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String, Integer> tmp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            tmp.put(aa.getKey(), aa.getValue());
        }

        return tmp;
    }

    public static void main(String[] args) {
        BestAlbum B = new BestAlbum();
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};
        for (int a : B.solution(genres, plays)) {
            System.out.print(a + " ");
        }
    }
}
