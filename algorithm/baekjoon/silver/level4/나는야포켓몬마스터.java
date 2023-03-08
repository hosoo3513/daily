package algorithm.baekjoon.silver.level4;

import java.util.HashMap;
import java.util.Scanner;

public class 나는야포켓몬마스터 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> name = new HashMap<>();
        String[] nameArr = new String[N+1];

        for (int i = 1; i <= N; i++) {
            String pokemon = scan.next();
            name.put(pokemon, i);
            nameArr[i] = pokemon;
        }

        for (int i = 0; i < M; i++) {
            String next = scan.next();
            if (isStringNumber(next)) {
                int index = Integer.parseInt(next);
                sb.append(nameArr[index]);
            } else {
                sb.append(name.get(next));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isStringNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
