/**
 * Simpler proof of concept of worm component.
 */
public class WormPOC {

    public static void main(String[] args) {
        Worm a = new Worm1L("VC1", "unc-4", "Intestine", "22.7", "1");
        Worm b = new Worm1L("VC2", "unc-7", "Intestine", "31.7", "3");

        //changing worm a so it is the same as worm b
        a.setName("VC2");
        a.setSleep("31.7");
        a.setGene("unc-7");
        a.addGen(2);
        System.out.println(a.equals(b));

    }

}
