import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import worm.Worm;

/**
 * JUnit test fixture for {@code Worm}'s abstract methods.
 *
 * @author Sreekar Kutagulla
 *
 */

public abstract class WormSecondaryTest {

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

        /*
         * Test setName with empty constructor.
         */
        @Test
        public void testsetName1() {
                String expected = "VC2";
                Worm x = this.constructorTest();
                x.setName("VC2");
                assertEquals(expected, x.get(0));
        }

        /**
         * Test setName with filled constructor.
         */
        @Test
        public void testsetName2() {
                String expected = "VC2";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                x.setName("VC2");
                assertEquals(expected, x.get(0));
        }

        /**
         * Test setGene with empty constructor.
         */
        @Test
        public void testsetGene1() {
                String expected = "unc-6";
                Worm x = this.constructorTest();
                x.setGene("unc-6");
                assertEquals(expected, x.get(1));
        }

        /**
         * Test setGene with filled constructor.
         */
        @Test
        public void testsetGene2() {
                String expected = "unc-6";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                x.setGene("unc-6");
                assertEquals(expected, x.get(1));
        }

        /**
         * Test setOrtholog with empty constructor.
         */
        @Test
        public void testsetOrtholog1() {
                String expected = "Neuron";
                Worm x = this.constructorTest();
                x.setOrtholog("Neuron");
                assertEquals(expected, x.get(2));
        }

        /**
         * Test setOrtholog with filled constructor.
         */
        @Test
        public void testsetOrtholog2() {
                String expected = "Neuron";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                x.setOrtholog("Neuron");
                assertEquals(expected, x.get(2));
        }

        /**
         * Test setSleep with empty constructor.
         */
        @Test
        public void testsetSleep1() {
                String expected = "20";
                Worm x = this.constructorTest();
                x.setSleep("20");
                assertEquals(expected, x.get(3));
        }

        /**
         * Test setSleep with filled constructor.
         */
        @Test
        public void testsetSleep2() {
                String expected = "30";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                x.setSleep("30");
                assertEquals(expected, x.get(3));
        }

        /**
         * Test getName with filled constructor.
         */
        @Test
        public void testgetName1() {
                String expected = "VC1";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                assertEquals(expected, x.getName());
        }

        /**
         * Test getName with empty constructor.
         */
        @Test
        public void testgetName2() {
                String expected = "";
                Worm x = this.constructorTest();
                assertEquals(expected, x.getName());
        }

        /**
         * Test getGene with filled constructor.
         */
        @Test
        public void testgetGene1() {
                String expected = "unc-4";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                assertEquals(expected, x.getGene());
        }

        /**
         * Test getGene with empty constructor.
         */
        @Test
        public void testgetGene2() {
                String expected = "";
                Worm x = this.constructorTest();
                assertEquals(expected, x.getGene());
        }

        /**
         * Test getOrtholog with filled constructor.
         */
        @Test
        public void testgetOrtholog1() {
                String expected = "Intestine";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                assertEquals(expected, x.getOrtholog());
        }

        /**
         * Test getOrtholog with empty constructor.
         */
        @Test
        public void testgetOrtholog2() {
                String expected = "";
                Worm x = this.constructorTest();
                assertEquals(expected, x.getOrtholog());
        }

        /**
         * Test getSleep with filled constructor.
         */
        @Test
        public void testgetSleep1() {
                String expected = "22.7";
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                assertEquals(expected, x.getSleep());
        }

        /**
         * Test getSleep with empty constructor.
         */
        @Test
        public void testgetSleep2() {
                String expected = "";
                Worm x = this.constructorTest();
                assertEquals(expected, x.getSleep());
        }

        /**
         * Test addGen.
         */
        @Test
        public void testaddGen1() {
                int add = 4;
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                String expected = "5";
                x.addGen(add);
                assertEquals(expected, x.get(4));

        }

        @Test
        public void testToString() {
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                String expected = "VC1unc-4Intestine22.71";
                assertEquals(expected, x.toString());

        }

        @Test
        public void testEquals() {
                Worm x = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                Worm y = this.constructorTest("VC1", "unc-4", "Intestine",
                                "22.7", "1");
                assertTrue(x.equals(y));

        }

}
