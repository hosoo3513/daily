package algorithm.programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinDistance {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public class Point{
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void bfs(int[][] maps, int[][] visit) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(0, 0));

        maps[0][0] = 0;

        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx <= maps.length-1 && ny >= 0 && ny <= maps[0].length-1 && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                    visit[nx][ny] = visit[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public int solution(int[][] maps) {
        int[][] visit = new int[maps.length][maps[0].length];

        bfs(maps, visit);

        if(visit[maps.length-1][maps[0].length-1] == 0) return -1;
        else return visit[maps.length - 1][maps[0].length - 1] + 1;
    }

    public static void main(String[] args) {
        MinDistance M = new MinDistance();
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(M.solution(maps));
    }
}
