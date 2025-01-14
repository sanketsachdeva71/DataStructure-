package Fibonacci;

public class Fibonacci {
    static int fib(int n){
        //Base Condition
        if(n<2){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a + b; 
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
