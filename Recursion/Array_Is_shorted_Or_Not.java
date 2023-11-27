package dataStructuresAndAlgorithmsDSA.Recursion;
// package Recursion;

public class Array_Is_shorted_Or_Not {

public static void isShorted(int [] Array , int idx){
    // Base case  >>> idx must be less than Array.length-2;
    if(idx > Array.length-2){
        System.out.println("Array is shorted.");
        return;
    }

    int currNum=Array[idx];  // finding current number
    if(currNum<=Array[idx+1]){  // checking if current num is smaller than  or equal to next num in the array.
        isShorted(Array, idx+1);  // Recursion 
    }else{
        System.out.println("Array is not Shorted;");
        return;
    }
}


    public static void main(String[] args) {
        int arr[]={1,7,2,3,4,5};
        isShorted(arr, 0);
    }
}
