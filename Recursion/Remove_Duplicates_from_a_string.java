package dataStructuresAndAlgorithmsDSA.Recursion;

public class Remove_Duplicates_from_a_string {

public static boolean [] map= new boolean[26];   // map array

public static String removeDuplicates(String str, int idx, String newString){
// Time complexity= O(n) , where n is length of string
    if(idx==str.length()){
        // System.out.println(newString);
        return newString;
    }
    char currchar=str.charAt(idx);
    if(map[currchar-'a']==true){
        return removeDuplicates(str, idx+1, newString);
    }else{
        newString +=currchar;
        map[currchar-'a']=true;
        return removeDuplicates(str, idx+1, newString);
    }
}
    public static void main(String[] args) {
        String str="jayyyprakk";
        String ans =removeDuplicates(str, 0, "");
        System.out.println(ans);
    }
}
