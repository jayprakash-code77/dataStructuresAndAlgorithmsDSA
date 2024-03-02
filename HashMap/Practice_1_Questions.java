package dataStructuresAndAlgorithmsDSA.HashMap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Practice_1_Questions {

    // maximum frequency number
    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else
                h.put(arr[i], 1);
        }
        int max = 0;
        int maxKey = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)

        {
            if (h.get(arr[i]) > max) {
                max = h.get(arr[i]);
                maxKey = arr[i];
            }
        }

        return maxKey;
    }

    public static void printIntersectionsOfArray(int arr1[], int arr2[]) {
        // creating HashMap
        Map<Integer, Integer> h = new HashMap<>();

        // Storing arr1 in the HashMap
        int count = 0;
        while (count != arr1.length) {
            if (h.containsKey(arr1[count])) {
                h.put(arr1[count], h.get(arr1[count]) + 1);
            } else {
                h.put(arr1[count], 1);
            }
            count++;
        }
        // now comparing and printing the intersections
        count = 0;
        while (count != arr2.length) {
            if (h.containsKey(arr2[count])) {
                if (h.get(arr2[count]) > 0) {
                    System.out.println(arr2[count]);
                    h.put(arr2[count], h.get(arr2[count]) - 1);
                }
            }
            count++;
        }
    }

    // function to find number of pair sum which sum up to 0.
    public static int PairSum(int[] input, int size) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int complement = -input[i];
            if (map.containsKey(complement)) {
                count++;
            }
            map.put(input[i], i);
        }

        return count;
    }

    public static void main(String[] args) {
        int input[] = {13,-2, -12, 2, 11, 12, -2, 1, -2, 2, -11, 12, 2, 6};
        int arr2[] = { 1, 2, 1, 6, 7, 1, 8 };

        // max Frequency Number
        // System.out.println(maxFrequencyNumber(arr));

        /*
         * // maximum frequency code written by me.
         * Map<Integer, Integer> map = new HashMap<>();
         * 
         * int count = 0;
         * while (count != arr.length) {
         * if (map.containsKey(arr[count])) {
         * map.put(arr[count], map.get(arr[count]) + 1);
         * } else {
         * map.put(arr[count], 1);
         * }
         * count++;
         * }
         * 
         * System.out.println(map.entrySet());
         * count = 0;
         * int maxFreq = -1;
         * int ansKey = -1;
         * while (count != arr.length) {
         * if (map.get(arr[count]) > maxFreq) {
         * maxFreq = map.get(arr[count]);
         * ansKey = arr[count];
         * }
         * count++;
         * }
         * 
         * System.out.println(ansKey);
         */

        // print Intersections Of Array
        // printIntersectionsOfArray(arr, arr2);

        // pair sum
        System.out.println(PairSum(input, 4));

    }
}
