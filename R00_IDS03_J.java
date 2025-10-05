/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 00. Input Validation and Data Sanitization (IDS)
*   IDS03-J. Do not log unsanitized user input
*   NON-COMPLIANT CODE
*/


public class R00_IDS03_J {
    public static void main(String[] args) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for : " + username);
        }else{
            logger.severe("User login failed for: " + username);
        }
    }
}
