package dataStructuresAndAlgorithmsDSA.Recursion;

public class Check_If_string_Is_Palindrome {

    public static String reverseStr_tring(String str, int idx, String newString) {
        if (idx < 0) {
            return newString;
        }
        char c = str.charAt(idx);
        newString = newString + c;
        return reverseStr_tring(str, idx - 1, newString);
    }

    // Second way
    private static boolean stringIsPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) == str.charAt(end)) {
            return stringIsPalindrome(str, start + 1, end - 1);
        }
        return false;
    }

    public static boolean isPalindromeCheck(String str) {
        return stringIsPalindrome(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {

        // First way to solve
        /*
         * String str="st8";
         * String call=reverseStr_tring(str, str.length()-1, "");
         * if(str.equals(call)){
         * System.out.println(true);
         * }else{
         * System.out.println(false);
         * }
         */

        // Second way to solve
        String str = "sts";
        boolean ans = isPalindromeCheck(str);
        System.out.println(ans);

    }
}
