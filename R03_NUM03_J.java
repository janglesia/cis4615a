/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 03. Numeric Types and Operations (NUM) 
*   NUM03-J. Use integer types that can fully represent the possible range of unsigned data
*   NON-COMPLIANT CODE
*/

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}

