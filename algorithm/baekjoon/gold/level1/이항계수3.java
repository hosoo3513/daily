package algorithm.baekjoon.gold.level1;

import java.util.Scanner;

public class 이항계수3 {

    final static long P = 1000000007;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        long numer = factorial(N) % P;
        long denom = (factorial(K) * factorial(N - K)) % P;

        System.out.println((numer * pow(denom, P - 2)) % P);
    }

    public static long factorial(long N) {
        long fac = 1L;

        while (N > 1) {
            fac = (fac * N) % P;
            N--;
        }
        return fac;
    }

    public static long pow(long base, long expo) {

        long result = 1;

        while (expo > 0) {
            if (expo % 2 == 1) {
                result *= base;
                result %= P;
            }
            base = (base * base) % P;
            expo /= 2;
        }
        return result;
    }
}
