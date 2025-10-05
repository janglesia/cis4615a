/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 09. Locking (LCK)
*   LCK05-J. Synchronize access to static fields that can be modified by untrusted code
*   NON-COMPLIANT CODE
*/

public final class R09_LCK05_J {
    private static int counter;
    public void incrementCounter() {
        counter++;
    }
}
