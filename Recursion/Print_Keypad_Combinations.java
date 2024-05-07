package dataStructuresAndAlgorithmsDSA.Recursion;

import java.util.Scanner;

public class Print_Keypad_Combinations {

    // Time Complexity = O(4^n).
public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };

public static void printKeypadCombinations(String srt, int idx,String combinations) {
    
    if(idx==srt.length()){
        System.out.println(combinations);
        return;
    } 

    char currchar=srt.charAt(idx);
    String mapping= keypad[currchar - '0']; // (currchar - '0') >>> this is used to remove the string of the number entered by the user.
    
    for(int i=0;i<mapping.length();i++){
        printKeypadCombinations(srt, idx+1, combinations+mapping.charAt(i));
    }
}

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        String str=Integer.toString(num);
        printKeypadCombinations(str, 0, "");
    }
}
