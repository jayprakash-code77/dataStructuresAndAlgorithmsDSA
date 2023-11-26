package Recursion;

import java.util.HashSet;

public class Print_subSequences_of_a_String {


    // Print all the subSequences of String
public static void subSequences(String str, int idx, String neString){
    if(idx==str.length()){
        System.out.println(neString);
        return;
    }
    char currchar=str.charAt(idx);
    // call 1
    subSequences(str, idx+1, neString+currchar); // current charactor is included.
    // call 2
    subSequences(str, idx+1, neString); // current charactor is not included.
}




// Print all the unique subSequences of a String
public static void UniqueSubSequences(String str, int idx, String neString, HashSet<String>set){
    if(idx==str.length()){

        if(set.contains(neString)){
            return;
        }else{
            System.out.println(neString);
            set.add(neString);
            return;
        }
    }

    char currechar=str.charAt(idx);
    // call 1
    UniqueSubSequences(str, idx+1, neString+currechar, set);
    // call 2
    UniqueSubSequences(str, idx+1, neString, set);
}

    public static void main(String[] args) {
    //  Print all the subSequences of String
        /* 
        String str="abc";
        subSequences(str, 0, "");
        */


        //  Print all the unique subSequences of a String
        /* 
        String str="aaa";
        HashSet<String> set =new HashSet<>();
        UniqueSubSequences(str, 0, "",set);
        */





    }
}
