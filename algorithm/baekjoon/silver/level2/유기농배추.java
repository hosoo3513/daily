package algorithm.baekjoon.silver.level2;

import java.util.Scanner;

public class 유기농배추 {
    static int[] dx = {-1,-1,0,0,}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int M = scan.nextInt();
            int N = scan.nextInt();
            int K = scan.nextInt();

            int[][] board = new int[M][N];

            for (int j = 0; j < K; j++) {
                int X = scan.nextInt();
                int Y = scan.nextInt();
                board[X][Y] = 1;
            }

            solution(board);
        }
    }



    public static void solution(int[][] board) {

    }
}
