package algorithm.cheatSheet;

import java.util.Arrays;
import java.util.Comparator;

/**
 * String 두개 합쳤을 때 오름차순 / 내림차순 정렬
 */

public class StringComparator {
    public String solution(int[] numbers) {

        String[] str = new String[numbers.length];
        for (int i = 0; i< numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
                // 오름차순 (o1 + o2).compareTo(o2 + o1)
            }
        });

        return null;
    }

}
