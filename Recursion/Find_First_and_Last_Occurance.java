// package Recursion;

public class Find_First_and_Last_Occurance {
    public static int first=-1;
    public static int last=-1;

public static void Occurance(String str, int idx,char element){
    // Base case
    if(idx==str.length()){
        System.out.println("First occurance at "+first+" index.");
        System.out.println("Last occurance at "+last+" index.");
        return;
    }
    // find current charactor
    char currchar=str.charAt(idx);
    // updating value of "first" and "last".
    if(currchar==element){
        if(first==-1){
            first=idx;
        }else {
            last=idx;
        }
    }
    // recursion
    Occurance(str, idx+1, element);
}

    public static void main(String[] args) {
        String str="abcda";
        // Time complexity = O(n)
        Occurance(str, 0, 'a');  // function call in main.
    }
}
