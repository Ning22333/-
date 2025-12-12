package 递归.斐波那契;

import java.util.Arrays;

public class fibonacci {
    public static void f(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        System.out.println(Fibonacci(n,cache));
    }
    public static int Fibonacci(int n, int[] cache) {
        if (cache[n]!=-1){
            return cache[n];
        }
        int a=Fibonacci(n-1,cache);
        int b=Fibonacci(n-2,cache);
        cache[n]=a+b;
        return cache[n];
    }
    public static void main(String[] args) {
        f(12);
    }
}
