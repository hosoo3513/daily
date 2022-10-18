package algorithm.programmers.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int end = 0; //수행 직후의 시간
        int jobsIdx = 0; //jobs 배열의 인덱스
        int count = 0; //수행된 요청 갯수

        // 요청 시간 오름차순 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 처리 시간 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        // 요청이 모두 수행될 때까지 반복
        while (count < jobs.length) {

            // 하나의 작업이 완료되는 시점까지 들어온 모든 요청을 큐에 넣음
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                pq.add(jobs[jobsIdx++]);
            }

            // 첫 시작이 0이 아닐 수도 있으므로
            if (pq.isEmpty()) end = jobs[jobsIdx][0];

            // 작업이 끝나기 전 들어온 요청 중 가장 수행시간 짧은 것부터 수행
            else {
                int[] tmp = pq.poll();
                answer += tmp[1] + end - tmp[0];
                end += tmp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        DiskController D = new DiskController();
        System.out.println(D.solution(new int[][]{{0, 10}, {4, 10}, {5, 11}, {15, 2}}));
    }
}
