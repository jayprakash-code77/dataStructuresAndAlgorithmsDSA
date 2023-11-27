// package Recursion;

public class Fibonacci_Sequence {

    // function to  print fibonacci sequence.

public static void fibonacci(int a,int b, int n){

    if(n==0){
        return;
    }
    int c=a+b;
    System.out.println(c);
    fibonacci(b, c, n-1);

}
    public static void main(String[] args) {

        int n=4;
        if(n==0 || n==1){
            System.out.println(0);
            return;
        }
        System.out.println(0);
        System.out.println(1);
        fibonacci(0, 1, n-2);


        
    }
}
