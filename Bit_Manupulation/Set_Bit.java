package dataStructuresAndAlgorithmsDSA.Bit_Manupulation;

public class Set_Bit {
    public static void main(String[] args) {
        /*
        Set Bit >>>
        Step 1= Bit mask: 1<<i, where 'i' is position.
        Step 2= Perform "OR" operation between Original number and Bit mask.

         */

        int n=5;
        int position=1;
        int bit_Mask=1<<position;
        int ans= bit_Mask | n;
        System.out.println(ans);
        
    }
}
