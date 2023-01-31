package algorithm.baekjoon.silver.level4;

import java.util.Scanner;

public class 체스판다시칠하기 {

    static char[][] board;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        board = new char[row][col];

        for (int i = 0; i < row; i++) {
            String next = scan.next();
            for (int j = 0; j < next.length(); j++) {
                board[i][j] = next.charAt(j);
            }
        }

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                getDifference(i, j);
            }
        }

        System.out.println(min);
    }

    private static void getDifference(int row, int col) {


        int difference = 0;

        for (int i = row; i < row + 8; i += 2) {
            for (int j = col; j < col + 8; j += 2) {
                if (board[i][j] != 'B') {
                    difference++;
                }
            }
            for (int j = col + 1; j < col + 9; j += 2) {
                if (board[i][j] != 'W') {
                    difference++;
                }
            }
        }

        for (int i = row + 1; i < row + 9; i += 2) {
            for (int j = col; j < col + 8; j += 2) {
                if (board[i][j] != 'W') {
                    difference++;
                }
            }
            for (int j = col + 1; j < col + 9; j += 2) {
                if (board[i][j] != 'B') {
                    difference++;
                }
            }
        }

        min = Math.min(min, Math.min(difference, 64 - difference));
    }
}
