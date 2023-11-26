package Bit_Manupulation;

public class Clear_Bit {
    public static void main(String[] args) {
        /*
        Clear bit >>>

        Step 1= Bit mask: 1<<i, where 'i' is position.
        Step 2= ~(Bit mask)
        Step 3= n &  ~(Bit mask)

         */

        int n=2;
        int position=0;
        int bit_Mask=1<<position;
        int NegationOfBM= ~ bit_Mask;
        int ans=n & NegationOfBM;
        System.out.println(ans);

    }
}
