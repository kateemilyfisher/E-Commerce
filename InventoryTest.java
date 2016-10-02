

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InventoryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InventoryTest
{
    private Inventory inventor1;

    /**
     * Default constructor for test class InventoryTest
     */
    public InventoryTest()
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
        inventor1 = new Inventory();
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
    public void addingProducts()
    {
        Jumpers jumpers1 = new Jumpers(10, "good", 10, 20, "blue");
        Tv tv1 = new Tv(200, "flatscreen tv", 30, 4, "plasma");
        inventor1.addProduct(jumpers1);
        inventor1.addProduct(tv1);
        inventor1.inventoryList();
    }

    @Test
    public void filtering()
    {
        WashingMachine washingM1 = new WashingMachine(100, "fast", 90, 3, 1300);
        Jumpers jumpers1 = new Jumpers(90, "warm", 40, 30, "yellow");
        Jumpers jumpers2 = new Jumpers(60, "new", 4, 10, "green");
        Jumpers jumpers3 = new Jumpers(40, "funky", 50, 10, "brown");
        Tv tv1 = new Tv(1000, "hq", 500, 4, "plasma");
        Tv tv2 = new Tv(80, "grabage", 40, 3, "plasma");
        Tv tv3 = new Tv(40, "portable", 1, 2, "portable");
        inventor1.addProduct(washingM1);
        inventor1.addProduct(jumpers1);
        inventor1.addProduct(jumpers3);
        inventor1.addProduct(tv1);
        inventor1.addProduct(tv2);
        inventor1.addProduct(tv3);
        inventor1.inventoryList();
        FilterHighRewardTracksuits f1 = new FilterHighRewardTracksuits();
        FilterJumpersSize10 f2 = new FilterJumpersSize10();
        FilterCheapPlasmaTvs f3 = new FilterCheapPlasmaTvs();
        assertNull(inventor1.search(f1));
        assertEquals(tv2, inventor1.search(f3));
        assertEquals(jumpers3, inventor1.search(f2));
    }
}


