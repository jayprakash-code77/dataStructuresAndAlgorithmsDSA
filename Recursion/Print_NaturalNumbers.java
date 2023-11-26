package Recursion;

public class Print_NaturalNumbers {

    // Print natural number from n to 1.
    public static void printNN(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        printNN(n-1);
    }


    // Print natural number from 1 to n.
    public static void PrintNumReverse(int From , int To){
        if(From>To){
            return;
        }
        System.out.print(From+" ");
        PrintNumReverse(From+1, To);
        
    }


    // Print sum of 'n' natural numbers. (METHOD 1)
    public static int printSum(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n;
        return printSum(n-1, sum);
    }


    // Print sum of 'n' natural numbers. (METHOD 2)
    public static void printSum2(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum2(n-1, sum);
    }


    // Print factorial of a number.
    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        int fac_to=factorial(num-1);
        int main_facto_ans=num * fac_to;
        return main_facto_ans;
    }


    public static void main(String[] args){

       printNN(5);


       PrintNumReverse(1,5);



       // method 1
       int ans=printSum(5,0);
       System.out.println("\n"+ans);
       // method 2
       printSum2(5,0);


    //    factorial of number
        int fact=factorial(5);
        System.out.println(fact);

    }
}
