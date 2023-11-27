package dataStructuresAndAlgorithmsDSA.Bit_Manupulation;

public class Update_Bit {
    public static void main(String[] args) {
        /*
        Update Bit >>>


        Case 1:- Makig bit '1'.
        
        Step 1= Bit mask: 1<<i, where 'i' is position.
        Step 2= Perform "OR" operation between Original number and Bit mask.


        Case 2:- Making bit '0';

        Step 1= Bit mask: 1<<i, where 'i' is position.
        Step 2= ~(Bit mask)
        Step 3= n &  ~(Bit mask)

         */

        //case 1 code  >>> Making bit '1';
        //  int n=0;
        //  int position=0;
        //  int bit_Mask=1<<position;
        //  int ans=n | bit_Mask;
        //  System.out.println(ans);

        // Case 2 code   >>> Making bit '0';
        int n=2;
        int position=1;
        int bit_Mask=1<<position;
        int NegationOfBM= ~ bit_Mask;
        int ans= NegationOfBM & n;
        System.out.println(ans);



        
    }
}
