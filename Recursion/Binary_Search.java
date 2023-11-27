package dataStructuresAndAlgorithmsDSA.Recursion;

public class Binary_Search {


public static void binarySearch_isPresent(int [] Array, int start, int end, int mid, int element){
    // base case
    if(start>end){
        System.out.println("Element not present.");
        return;
    }
    mid=(start+end)/2; // calculating mid 
    int currNum=Array[mid]; 
    // checking if the current Number is equal to element.
    if(currNum==element){
        System.out.println("Element is present.");
        return;
    }
    // updating start and end.
    if(Array[mid]>element){
         end=mid-1;
    }else{
        start=mid+1;
    }
    // Recursive function
    binarySearch_isPresent(Array,start,end,mid, element);


}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,45};
        binarySearch_isPresent(arr, 0, arr.length-1,0,8);
    }
}
