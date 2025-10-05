/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 02. Expressions (EXP)
*   XP00-J. Do not ignore values returned by methods
*   NON-COMPLIANT CODE
*/

public class R02_XP00_J {
    public void deleteFile(){
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
    }
}