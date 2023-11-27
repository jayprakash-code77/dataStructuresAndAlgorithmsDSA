package dataStructuresAndAlgorithmsDSA.Recursion;

public class Print_Keypad_Combinations {

    // Time Complexity = O(4^n).
public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

public static void printKeypadCombinations(String srt, int idx,String combinations){

    if(idx==srt.length()){
        System.out.println(combinations);
        return;
    }

    char currchar=srt.charAt(idx);
    String mapping= keypad[currchar-'0'];

    for(int i=0;i<mapping.length();i++){
        printKeypadCombinations(srt, idx+1, combinations+mapping.charAt(i));
    }
}

    public static void main(String[] args) {
        
        String str="3";
        printKeypadCombinations(str, 0, "");
    }
}
