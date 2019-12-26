package llstack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michal
 */
public class LLStackTest
{

    public LLStackTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of push method, of class LLStack.
     */
    @Test
    public void testPush()
    {
        System.out.println("push");
        Object element = 5;
        Object element2 = 10;
        LLStack instance = new LLStack();
        instance.push(element);

        Object expResult = 5;
        Object result = instance.peek();
        assertEquals(expResult, result);

        instance.push(element2);
        expResult = 10;
        result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class LLStack.
     */
    @Test
    public void testIsEmpty()
    {
        System.out.println("isEmpty");

        LLStack instance = new LLStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

        instance.push("blob");
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);

        instance.pop();
        expResult = true;
        result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of pop method, of class LLStack.
     */
    @Test
    public void testPop()
    {
        System.out.println("pop");

        LLStack instance = new LLStack();

        instance.push(2);
        instance.push(3.8);

        Object expResult = 3.8;
        Object result = instance.pop();
        assertEquals(expResult, result);

        instance.pop();

        expResult = null;
        result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class LLStack.
     */
    @Test
    public void testPeek()
    {
        System.out.println("peek");

        LLStack instance = new LLStack();
        instance.push(5);
        instance.pop();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);

        instance.push("yellow");
        instance.push("sub");
        expResult = "sub";
        result = instance.peek();
        assertEquals(expResult, result);

        instance.pop();
        expResult = "yellow";
        result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LLStack.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        LLStack instance = new LLStack();
        String expResult = "->";
        String result = instance.toString();
        assertEquals(expResult, result);

        instance.push(0);
        instance.push(7);
        instance.push(7);
        expResult = "->7->7->0->";
        result = instance.toString();
        assertEquals(expResult, result);

        instance.pop();
        instance.pop();
        instance.pop();
        instance.pop();
        expResult = "->";
        result = instance.toString();
        assertEquals(expResult, result);
    }

}
