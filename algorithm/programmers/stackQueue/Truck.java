package algorithm.programmers.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> Q = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while (true) {
                if (Q.isEmpty()) {
                    Q.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (Q.size() == bridge_length) {
                    sum -= Q.poll();
                } else {
                    if (sum + truck <= weight) {
                        Q.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        Q.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }

    /*public int solution2(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < bridge_length-1; i++) Q.offer(0);
        Q.offer(truck_weights[0]); // 0 ~~~ 0 7

        for (int i=1; i<truck_weights.length; i++) {
            while (Q.stream().mapToInt(x -> x).sum() + truck_weights[i] > weight) {
                Q.offer(0);
                Q.poll();
                if (Q.stream().filter(h -> h!=0).findAny().isPresent())
                    answer++;
            }
            Q.offer(truck_weights[i]);
            Q.poll();
            answer++;
        }
        answer += bridge_length;

        return answer;
    }*/

    public static void main(String[] args) {
        Truck T = new Truck();
        System.out.println(T.solution(3, 10, new int[]{7,4,5,6,1,3}));
    }
}
