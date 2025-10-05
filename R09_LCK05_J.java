/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 09. Locking (LCK)
*   LCK05-J. Synchronize access to static fields that can be modified by untrusted code
*   COMPLIANT SOLUTION
*/

public final class R09_LCK05_J {
    private static int counter;
    private static final Object lock = new Object();
    public void incrementCounter() {
        synchronized (lock) {
            counter++;
        }
    }
}
