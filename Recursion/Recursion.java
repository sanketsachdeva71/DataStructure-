package Recursion;

public class Recursion {
    static void  printDescending(int n ){
        //Base Condition to stop infinite loop 
        if(n<1){
        return;
        }
        System.out.println(n);
        printDescending(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printDescending(n);
    }
}
