package Bit_Manupulation;
// package Bit_Manupulation;

public class Get_Bit {
    public static void main(String[] args) {
        /*
        1) Get Bit

        Step 1= Bit mask: 1<<i, where 'i' is position.
        Step 2= Perform "AND" operation between Original number and Bit mask.
        */

        int n=5;
        int position=1; // position of bit that we want to find;
        int bit_Mask=1<<position;
        int newNum= n | bit_Mask;
        System.out.println(newNum);
    }
}
