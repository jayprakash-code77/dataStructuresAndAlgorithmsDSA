package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming.AccessModifires;

class Account {
     public String name;
     protected String email;
     private String pass;

     public void setPass(String Password) {
          this.pass = Password;
     }

     public void getPass() {
          System.out.println(this.pass);
     }
}

public class Basic_ConceptOf_AccessMOdifier {
     public static void main(String[] args) {
          /*
           * Type of Access Modifiers:-
           * 1) Public:- It can be Accessed from anywhere.
           * 2) Default:- It can be Accessed anywhere inside the same Package.
           * 3) Protected:- It can be Accessed from different "subClasses" of any package
           * and inside current package "all the classes has the access".
           * 4) Private:- It can be Accessed inside the same class only.
           */

          Account a = new Account();
          a.setPass("jay");
          a.getPass();

          // Encapsulation:- Data and Fuctions together form a unit called
          // "encapsulation".
          // Data hiding is possible due to use of Access Modifires and the concept of
          // "Encapsulation".

     }
}
