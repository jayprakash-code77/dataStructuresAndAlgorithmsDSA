package dataStructuresAndAlgorithmsDSA.Recursion;

public class Print_a_String_in_Reverse {

public static void reverse(String str, int idx){
// Base case
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    // print last charactor
    System.out.print(str.charAt(idx));
    // calling reverse function itself.
    reverse(str, idx-1);
}
    public static void main(String[] args) {
        String str="abcd";
        int n=str.length()-1;
        reverse(str,n ); // calling function in main class.
    }
}
