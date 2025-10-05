/*  Angie Jiang, an897581
*   Michael McAlpin
*   CIS 4615
*   5 October 2025
*   
*   Rule 05. Object Orientation (OBJ)
*   OBJ05-J. Do not return references to private mutable class members
*   COMPLIANT SOLUTION
*/

public class R05_OBJ05_J {
    class MutableClass {
        private Date d;
        public MutableClass() {
            d = new Date();
        }
        public Date getDate() {
            return (Date)d.clone();
        }
    }
}
