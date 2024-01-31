package dataStructuresAndAlgorithmsDSA.BackTracking;

public class permutations {

    public static void printPermutation(String str, String permutation, int idx){
        // base case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);

            printPermutation(newString, permutation + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String permu = "ABCD";
        printPermutation(permu, "", 0);
    }

}
