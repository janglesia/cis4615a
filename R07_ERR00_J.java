/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 07. Exceptional Behavior (ERR)
*   ERR00-J. Do not suppress or ignore checked exceptions
*   NON-COMPLIANT CODE
*/

import java.io.IOException;

public class R07_ERR00_J {
    public static void main(String[] args) {
        try {
            //...
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
