package algorithm.baekjoon.silver.level2;

import java.util.Scanner;

public class 유기농배추 {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int M, N;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            M = scan.nextInt();
            N = scan.nextInt();
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
        int answer = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    DFS(i, j, board);
                }
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }
}
