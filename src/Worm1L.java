import java.util.ArrayList;
import java.util.Arrays;

public class Worm1L extends WormSecondary {

    private ArrayList<String> rep;

    private void createNewRep() {
        this.rep = new ArrayList<>();

    }

    public Worm1L(String name, String gene, String ortholog, String sleep,
            String gen) {
        this.rep = new ArrayList<String>(Arrays.asList(name, gene, ortholog, sleep, gen));
    }

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