package algorithm.programmers.sort;

import java.util.*;

public class BigNumber {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String str_numbers[] = new String[numbers.length];

        for (int i = 0; i < str_numbers.length; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str_numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
                // 오름차순 (o1 + o2).compareTo(o1 + o2)
            }
        });

        if (str_numbers[0].startsWith("0")) {
            answer.append("0");
        } else {
            for (int i = 0; i < str_numbers.length; i++) {
                answer.append(str_numbers[i]);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        BigNumber B = new BigNumber();
        System.out.println(B.solution(new int[]{6, 10, 2}));
        System.out.println(B.solution(new int[]{3, 30, 34, 5, 9}));
    }
}
