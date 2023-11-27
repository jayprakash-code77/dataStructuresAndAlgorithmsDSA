package dataStructuresAndAlgorithmsDSA.Recursion;
// package Recursion;

public class Print_x_to_the_Power_n {

    // Print x^n with stack height "n".  (1st method)
public static int power1(int x, int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    int ans= x * power1(x, n-1);
    return ans;
}



// Print x^n with stack height "n".  (2nd method)
public static int power2(int x,int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    int xpw=power2(x, n-1);
    return x*xpw;
}



// Print x^n with stack height "n".  (3rd method) "WITH TIME COMPLRXITY OF (Log n)"

public static int power3(int x,int n){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }

    if(n%2==0){
       return power3(x, n/2) * power3(x, n/2);
    }else{
        return power3(x, n/2) * power3(x, n/2) * x;
    }


}






    public static void main(String[] args) {
//  power 1 function
        /* 
        int ans = power1(2, 2);
        System.out.println(ans);
        */
//  power 2 function
        /* 
        int ans2= power2(2, 2);
        System.out.println(ans2);
        */

//  power 3 function 

        int ans3=power3(2, 2);
        System.out.println(ans3);

    }
}
