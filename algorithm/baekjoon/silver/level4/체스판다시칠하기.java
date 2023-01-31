package algorithm.baekjoon.silver.level4;

import java.util.Scanner;

public class 체스판다시칠하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        String[] board = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = scan.next();
        }

        int difference = 0;

        for (int i = 0; i < row; i += 2) {
            for (int j = 0; j < col; j += 2) {
                if (board[i].charAt(j) != 'B') {
                    difference++;
                }
            }
            for (int j = 1; j < col; j += 2) {
                if (board[i].charAt(j) != 'W') {
                    difference++;
                }
            }
        }

        for (int i = 1; i < row; i += 2) {
            for (int j = 0; j < col; j += 2) {
                if (board[i].charAt(j) != 'W') {
                    difference++;
                }
            }
            for (int j = 1; j < col; j += 2) {
                if (board[i].charAt(j) != 'B') {
                    difference++;
                }
            }
        }

        System.out.println(Math.min(difference, row * col - difference));
    }
}
