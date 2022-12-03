package algorithm.programmers.level1;

public class 짝수홀수 {
    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
    }
}
