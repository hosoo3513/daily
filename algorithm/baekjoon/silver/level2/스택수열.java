package algorithm.baekjoon.silver.level2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int tmp = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= arr.length; i++) {
            stack.push(i);
            arrayList.add("+");
            while (stack.size() != 0 && stack.peek() == arr[tmp]) {
                tmp++;
                stack.pop();
                arrayList.add("-");
            }
        }

        if (arrayList.size() == n * 2) {
            for (String str : arrayList) {
                System.out.println(str);
            }
        } else {
            System.out.println("NO");
        }
    }
}
