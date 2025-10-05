/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 01. Declarations and Initialization (DCL)
*   DCL00-J. Prevent class initialization cycles
*   COMPLIANT SOLUTION
*/

public class R01_DCL00_J {
    private final int balance;
    private static final int deposit = (int) (Math.random() * 100); // Random deposit
    private static final Cycle c = new Cycle();  // Inserted after initialization of required fields
    public Cycle() {
        balance = deposit - 10; // Subtract processing fee
    }
    public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
    }
}
