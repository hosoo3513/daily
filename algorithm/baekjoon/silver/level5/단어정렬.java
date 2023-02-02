package algorithm.baekjoon.silver.level5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class 단어정렬 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = scan.next();
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList(str));
        String[] arr = lhs.toArray(new String[0]);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int r =  o1.length() - o2.length();
                if (r == 0) {
                    r = o1.compareTo(o2);
                }
                return r;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
