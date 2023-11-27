package dataStructuresAndAlgorithmsDSA.Recursion;
// package Recursion;
public class Linear_Search {

public static String isPresent(int[] Array, int Size, int element){
    // base case
    if(Size<=0){
        return "Element not present.";
    }
    // Storing current number in "currNum" variable;
    int currNum=Array[Size-1];
    // Checking if element is present or not 
    if(currNum == element){
        return "Element is present.";
    }
    return isPresent(Array, Size-1, element);  // recursive function


}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        String ans=isPresent(arr, arr.length, 5);
        System.out.println(ans);
    }
}
