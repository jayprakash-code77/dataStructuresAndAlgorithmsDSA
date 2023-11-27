package dataStructuresAndAlgorithmsDSA.Recursion;
// package Recursion;

public class check_Array_is_shorted_in_Strictly_Increasing_order {

public static boolean isShorted(int []arr, int idx){

    if(idx==arr.length-1){
        return true;
    }

    if(arr[idx]>=arr[idx+1]){
        return false; 
    }
    return isShorted(arr, idx+1);

}
    public static void main(String[] args) {
        int []arr={1,2,3,5};
        System.out.println(isShorted(arr, 0));
        
    }
}
