package algorithm.baekjoon.gold.level2;

import java.util.Scanner;

public class 피보나치수3 {

    static int[] fibo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        fibo = new int[num + 1];

        System.out.println(DFS(num));

    }

    public static int DFS(int n) {
        if(fibo[n] > 0) return fibo[n] % 1000000;

        if (n <= 1) return fibo[n] = n;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = (DFS(n - 2) + DFS(n - 1)) % 1000000;
    }
}
