package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming.Advanced_OPPS_Concepts;

public class Nested_Classes {
    /**
     * InnerNested_Classes
     */
    class InnerNested_1_Classes {
        
    }

    /*
     * InnerNested_Classes
     */

    static class InnerNested_2_Classes {
        
    }

    public static void main(String[] args) {
        /* 
        // this down line will show error because the instance of the "Inner <non-static> class cannot be made directly. Non-static inner classes in Java are associated with an instance of their outer class, and you need an instance of the outer class to create an instance of the inner class.
        InnerNested_1_Classes n1 = new InnerNested_1_Classes();              
        */

        // Making the instance (Object) of < Non- static class inside the "Nested_Classes" >
        Nested_Classes nest = new Nested_Classes();
        Nested_Classes.InnerNested_1_Classes obj = nest.new InnerNested_1_Classes();

        InnerNested_2_Classes n2 = new InnerNested_2_Classes();  // this will not show error because this "InnerNested_2_Classes" class is a <static class inside the "Nested_Classes">

    }
}
