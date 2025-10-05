/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 04. Characters and Strings (STR)
*   STR03-J. Do not encode noncharacter data as a string
*   NON-COMPLIANT CODE
*/

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        Strings = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }
}
