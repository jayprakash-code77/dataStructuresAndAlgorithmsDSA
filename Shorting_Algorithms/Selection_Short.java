package dataStructuresAndAlgorithmsDSA.Shorting_Algorithms;

public class Selection_Short {
    // function to print an array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 3, 1, 2 };
        // Operations
        for (int i = 0; i < arr.length; i++) {
            int small = i; // Initializing small
            for (int j = i; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j; // finding the index of smallest element
                }
            }
            // swaping the smaller element the i th index
            int swap = arr[i];
            arr[i] = arr[small];
            arr[small] = swap;
        }
        // printing the shorted array
        printArray(arr);
    }
}
