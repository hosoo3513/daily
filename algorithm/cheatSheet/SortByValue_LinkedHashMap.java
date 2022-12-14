package algorithm.cheatSheet;

import java.util.*;

/**
 * hashMap에서 value값 기준으로 정렬해야할 때 쓴다.
 * override 부분에서 return (o1.getValue()).compareTo(o2.getValue)로 비교하게 되면 오름차순이다.
 * 만약 반대로 (o2.getValue()).compareTo(o1.getValue())로 쓸 경우에는 내림차순이 된다.
 */

public class SortByValue_LinkedHashMap {
    public static LinkedHashMap<String, Integer> sortByValue(LinkedHashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());

        // 오름차순
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        LinkedHashMap<String, Integer> tmp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> l : list) {
            tmp.put(l.getKey(), l.getValue());
        }
        
        return tmp;
    }
}
