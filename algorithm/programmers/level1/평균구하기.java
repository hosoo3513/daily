package algorithm.programmers.level1;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (double) sum / arr.length;
    }
}
