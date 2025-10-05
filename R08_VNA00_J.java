/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 08. Visibility and Atomicity (VNA)
*   VNA00-J. Ensure visibility when accessing shared primitive variables
*   COMPLIANT SOLUTION
*/

final class R08_VNA00_J implements Runnable {
    private volatile boolean done = false;
    @Override public void run() {
        while (!done) {
            try {
                // ...
                Thread.currentThread().sleep(1000); // Do something
            } catch(InterruptedException ie) {
                Thread.currentThread().interrupt(); // Reset interrupted status
            }
        }   
    }
    public void shutdown() {
        done = true;
    }
}
