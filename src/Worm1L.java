
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Allows a user to transverse through a Worm.
 *
 */
public class Worm1L extends WormSecondary {

    /**
     * Representation of {@code this}
     *
     * I am using an ArrayList to represent the Worm component because of mainly
     * two reasons. One, the Worm has 5 properties or variables being
     * manipulated and in our lab, these worms are put into a 6 by 8 silicon
     * mold (matrix). This way, the data is formatted in a 2d array. As a
     * result, it makes it easier to stay with that same data format, which in
     * this case is an ArrayList. The second reason is that I have a lot of
     * experience using arrays, specifically from Python and it is a way I look
     * at data most of the time. So,I found it much easier to go with this
     * approach.
     *
     */
    private ArrayList<String> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new ArrayList<>();

    }

    /**
     * No-Argument Constructor.
     */
    public Worm1L() {
        this.createNewRep();
    }

    /**
     *
     * @param name
     *            name input for Worm, located in first spot of arrayList.
     * @param gene
     *            gene input for Worm, located in second spot of arrayList.
     * @param ortholog
     *            ortholog input for Worm, located in third spot of arrayList.
     * @param sleep
     *            sleep input for Worm, located in fourth spot of arrayList.
     * @param gen
     *            generation input for worm, located in fifth spot of arrayList.
     */
    public Worm1L(String name, String gene, String ortholog, String sleep,
            String gen) {
        this.rep = new ArrayList<String>(
                Arrays.asList(name, gene, ortholog, sleep, gen));
    }

    /**
     * Standard Methods.
     */

    @Override
    public final Worm newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(Worm source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof Worm1L : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";

        Worm1L localSource = (Worm1L) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /**
     * Kernel Methods.
     */

    @Override
    public final boolean isMutated() {
        boolean result = true;
        if (this.rep.get(2).isEmpty()) {
            result = false;
        }

        return result;
    }

    @Override
    public final boolean isSleep() {
        boolean result = true;
        if (this.rep.get(3).isEmpty()) {
            result = false;
        }

        return result;
    }

    @Override
    public final void set(int var1, String var2) {
        this.rep.set(var1, var2);
    }

    @Override
    public final String get(int var1) {
        return this.rep.get(var1);
    }

}
