package algorithm.programmers.fullSearch;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 1; i <= brown / 2; i++) {
            for (int j = 1; j <= brown / 2; j++) {
                if (2 * i + 2 * j - 4 == brown && (i - 2) * (j - 2) == yellow) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Carpet C = new Carpet();
        for (int i : C.solution(10,2)) System.out.print(i + " ");
        for (int i : C.solution(8,1)) System.out.print(i + " ");
        for (int i : C.solution(24,24)) System.out.print(i + " ");

    }
}
