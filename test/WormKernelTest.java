import static org.junit.Assert.assertEquals;

import org.junit.Test;

import worm.Worm;

/**
 * JUnit test fixture for {@code Worm}'s kernel methods.
 *
 * @author Sreekar Kutagulla
 *
 */

public abstract class WormKernelTest {

    /**
     * Invoked appropriate worm constructor for test implementation.
     *
     * @return the new worm
     */
    protected abstract Worm constructorTest();

    /**
     * Invoked appropriate worm constructor for test implementation.
     *
     * @return the new worm
     */
    protected abstract Worm constructorTest(String a, String b, String c,
            String d, String e);

    /**
     * Tests isMutated with empty constructor.
     */
    @Test
    public void testisMutatedF() {
        Worm x = this.constructorTest();
        assertEquals(false, x.isMutated());
    }

    /**
     * Tests isMutated with filled in constructor.
     *
     */
    @Test
    public void testisMutatedT() {
        Worm x = this.constructorTest("VC1", "unc-4", "Intestine", "22.7", "1");
        assertEquals(true, x.isMutated());
    }

    /**
     * Tests isSleep with empty constructor.
     *
     */
    @Test
    public void testisSleepF() {
        Worm x = this.constructorTest();
        assertEquals(false, x.isSleep());
    }

    /**
     * Tests isSleep with filled in constuctor.
     *
     */
    @Test
    public void testisSleepT() {
        Worm x = this.constructorTest("VC1", "unc-4", "Intestine", "22.7", "1");
        assertEquals(true, x.isSleep());
    }

    /**
     * Tests set with empty constructor.
     *
     */
    @Test
    public void testSet1() {
        String expected = "VC2";
        Worm x = this.constructorTest();
        x.set(0, "VC2");
        assertEquals(expected, x.get(0));
    }

    /**
     * Tests set with filled in constructor.
     *
     */
    @Test
    public void testSet2() {
        String expected = "VC2";
        Worm x = this.constructorTest("VC1", "unc-4", "Intestine", "22.7", "1");
        x.set(0, "VC2");
        assertEquals(expected, x.get(0));
    }

    /**
     * Tests get with filled in constructor.
     *
     */
    @Test
    public void testGet1() {
        String expected = "VC1";
        Worm x = this.constructorTest("VC1", "unc-4", "Intestine", "22.7", "1");
        assertEquals(expected, x.get(0));
    }

    /**
     * Tests get with empty constructor.
     *
     */
    @Test
    public void testGet2() {
        String expected = "";
        Worm x = this.constructorTest();
        assertEquals(expected, x.get(0));
    }

}
