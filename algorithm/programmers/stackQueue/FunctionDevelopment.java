package algorithm.programmers.stackQueue;

import java.util.*;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> Q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int tmp = 0;

        //Queue에 progresses를 담는다
        for (int i = 0; i < progresses.length; i++) {
            Q.offer(progresses[i]);
        }

        //Q.poll()을 이용할건데, 모두 빠질 때까지 반복
        while (!Q.isEmpty()) {
            //뺌과 동시에 더해서 다시 넣는다.
            for (int i = 0; i < Q.size(); i++) {
                Q.offer(Q.poll() + speeds[i+tmp]);
            }
            int num = 0;
            //뺀 값이 100이 넘으면 그 뒤로 100을 넘는 값을 모두 빼고, 그 수를 num에 저장
            while (!Q.isEmpty() && Q.peek() >= 100) {
                Q.poll();
                num++;
                tmp++;
            }
            if (num>0) list.add(num);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    /**
     * while문 안에서 만약 day가 본인이 나가야할 타이밍보다 더 많이 늘어다면 day는 증가되지 않는다.
     * 따라서 그 때 dayOfEnd[day]++는 두 번 이상 실행되고, 그에 따라 한번에 몇 개씩 나가는지 알 수 있다.
     * [0,0,---,2,0,0,0,---,1,0,0,0] 은 람다식에 의해 [2,1]로 바뀐다.
     */
    public int[] solution2(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfEnd[day]++;
        }
        return Arrays.stream(dayOfEnd).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
        FunctionDevelopment F = new FunctionDevelopment();
        int[] progresses1 = new int[]{93, 30, 55};
        int[] progresses2 = new int[]{95, 90, 99, 99, 80, 99};
        int[] speed1 = new int[]{1, 30, 5};
        int[] speed2 = new int[]{1, 1, 1, 1, 1, 1};

        for (int i : F.solution(progresses1, speed1)) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : F.solution(progresses2, speed2)) {
            System.out.print(i);
        }

    }
}
