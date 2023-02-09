package algorithm.baekjoon.bronze.level2;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int i=1;

        while (i <= num) {
            String s = Integer.toString(i);
            int tmp = i;
            for (char x : s.toCharArray()) {
                tmp += Character.getNumericValue(x);
            }
            if (tmp == num) {
                break;
            } else {
                i++;
            }
        }

        if (i > num) {
            System.out.println(0);
        } else {
            System.out.println(i);
        }
    }
}
