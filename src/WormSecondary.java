
/**
 * Layered implementation of secondary methods
 */
public abstract class WormSecondary implements Worm {

    /**
     * sets the name of the Worm by taking input.
     */
    @Override
    public final void setName(String var1) {
        this.set(0, var1);
    }

    /**
     * only sets the gene of the Worm if there has been a mutation.
     */
    @Override
    public final void setGene(String var1) {

        if (this.isMutated()) {
            this.set(1, var1);
        }

        else {
            this.set(1, "");
        }
    }

    /**
     * only sets the ortholog of the Worm if there has been a mutation.
     */
    @Override
    public final void setOrtholog(String var1) {
        if (this.isMutated()) {
            this.set(2, var1);
        }

        else {
            this.set(2, "");
        }

    }

    /**
     * only sets the sleep of the Worm if the worm has previous sleep score.
     */
    @Override
    public final void setSleep(String var1) {
        if (this.isSleep()) {
            this.set(3, var1);
        }

        else {
            this.set(3, "");
        }

    }

    /**
     * retrieves the name of the Worm.
     */
    @Override
    public final String getName() {

        String root = this.get(0);
        return root;

    }

    /**
     * retrieves the gene of the Worm.
     */
    @Override
    public final String getGene() {

        String root = this.get(1);
        return root;
    }

    /**
     * retrieves the ortholog of the Worm.
     */
    @Override
    public final String getOrtholog() {

        String root = this.get(2);
        return root;

    }

    /**
     * retrieves the sleep of the Worm.
     */
    @Override
    public final String getSleep() {

        String root = this.get(3);
        return root;

    }

    /**
     * adds a specified input to the generation of the Worm.
     */
    @Override
    public final void addGen(int var1) {
        String root = this.get(4);
        int foo = Integer.parseInt(root);
        int result = foo + var1;

        this.set(4, String.valueOf(result));

    }

    @Override
    public String toString() {
        String worm = "";
        for (int i = 0; i < 5; i++) {
            worm += this.get(i);
        }

        return worm;
    }

    @Override
    public boolean equals(Object c) {
        boolean equal = true;
        String str = c.toString();
        if (!this.toString().equals(str)) {
            equal = false;
        }
        return equal;

    }

}
