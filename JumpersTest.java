

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JumpersTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JumpersTest
{
    private Jumpers jumpers1;

    /**
     * Default constructor for test class JumpersTest
     */
    public JumpersTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        jumpers1 = new Jumpers(20, "Ward Jumper", 10, 30, "red");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void gettingColour()
    {
        assertEquals("red", jumpers1.getColour());
    }
}

