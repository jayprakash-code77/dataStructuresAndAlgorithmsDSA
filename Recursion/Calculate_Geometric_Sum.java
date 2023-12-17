package dataStructuresAndAlgorithmsDSA.Recursion;

import java.text.DecimalFormat;

public class Calculate_Geometric_Sum {
    

    // function to calculate Geometric sum.
    public static double calculateGeometricSum(double x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        } else {
            // Recursive case: x^n + calculateGeometricSum(x, n-1)
            return Math.pow(x, n) + calculateGeometricSum(x, n - 1);
        }
    }

    // main function
    public static void main(String[] args) {

        // Example

        double x = 0.5; // base
        int n = 3; // number of terms
        double result = calculateGeometricSum(x, n);

        // Format the result to have 5 decimal places
        DecimalFormat df = new DecimalFormat("#.#####");
        // Print sum
        System.out.println("Geometric sum: " + df.format(result));
    }

}
