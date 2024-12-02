
public abstract class WormSecondary implements Worm {

    @Override
    public final void setName(String var1) {
        this.set(0, var1);
    }

    @Override
    public final void setGene(String var1) {

        if (this.isMutated()) {
            this.set(1, var1);
        }

        else {
            this.set(1, "");
        }
    }

    @Override
    public final void setOrtholog(String var1) {
        if (this.isMutated()) {
            this.set(2, var1);
        }

        else {
            this.set(2, "");
        }

    }

    @Override
    public final void setSleep(String var1) {
        if (this.isSleep()) {
            this.set(3, var1);
        }

        else {
            this.set(3, "");
        }

    }

    @Override
    public final String getName() {

        String root = this.get(0);
        return root;

    }

    @Override
    public final String getGene() {

        String root = this.get(1);
        return root;
    }

    @Override
    public final String getOrtholog() {

        String root = this.get(2);
        return root;

    }

    @Override
    public final String getSleep() {

        String root = this.get(3);
        return root;

    }

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

    //fix this
    @Override
    public boolean equals(Object c) {
        boolean equal = true;
        if (!(c instanceof String)) {
            equal = false;
        } else {
            String str = (String) c;

            //ArrayList<String> temp = new ArrayList<>();

        }

        return equal;

    }

}
