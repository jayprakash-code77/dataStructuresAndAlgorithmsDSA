package dataStructuresAndAlgorithmsDSA.Recursion;

public class Print_all_permutations_of_a_string {
    public static void printPermu(String str, String permutation) {
        // base case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        // performing task
        for (int i = 0; i < str.length(); i++) {
            // current charactor
            char currChar = str.charAt(i);
            // new string
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // recursive function
            printPermu(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        // String
        String str = "abcd";
        // calling "printPermu" function
        printPermu(str, "");
    }
}
