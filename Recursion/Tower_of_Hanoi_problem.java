package dataStructuresAndAlgorithmsDSA.Recursion;

public class Tower_of_Hanoi_problem {

public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n==1){
        System.out.println("transfer disc "+n+" from "+src+" to "+dest);
        return;
    }
     towerOfHanoi(n-1, src, dest, helper);
     System.out.println("transfer disc "+n+" from "+src+" to "+dest);
     towerOfHanoi(n-1, helper, src, dest);

}
    public static void main(String[] args) {
        // function call
        towerOfHanoi(2, "S", "H", "D");
    }
}
