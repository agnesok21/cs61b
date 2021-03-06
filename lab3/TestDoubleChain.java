import static org.junit.Assert.*;

import org.junit.Test;

/** Perform tests of the DoubleChain class
 */

public class TestDoubleChain {

    /** Tests the constructor of DoubleChain */
    @Test
    public void testConstructor() {
        DoubleChain d = new DoubleChain(5);
        assertEquals(5,d.getFront().val, 1e-6);
    }

    /** Tests some basic DoubleChain operations. */
    @Test
    public void testBasicOperations() {
        DoubleChain d = new DoubleChain(5);
        assertEquals(5, d.getFront().val, 1e-11);
        assertEquals(5, d.getBack().val, 1e-11);

        d.insertFront(3);
        d.insertFront(1);
        d.insertBack(7);
        d.insertBack(8);
        assertEquals(1, d.getFront().val, 1e-11);
        assertEquals(8, d.getBack().val, 1e-11);
        for(int i=0;i<5;i++)
        {
            d.deleteBack();
        }
        assertEquals(true,d.empty());
        
        DoubleChain lst = DoubleChain.list(1,2,3);
        assertEquals(1,lst.getFront().val,1e-11);
        assertEquals(""+DoubleChain.list(1,2,3),"<[1.0,2.0,3.0]>");
        assertEquals(""+DoubleChain.list(1),"<[1.0]>");
    }

    public static void main(String[] args) {
       jh61b.junit.textui.runClasses(TestDoubleChain.class);
    }
}
