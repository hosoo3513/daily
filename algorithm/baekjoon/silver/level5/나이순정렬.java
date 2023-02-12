package algorithm.baekjoon.silver.level5;

import java.util.*;

public class 나이순정렬 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String[][] arr = new String[num][2];

        for (int i = 0; i < num; i++) {
            arr[i][0] = scan.next(); // 나이
            arr[i][1] = scan.next(); // 이름
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
