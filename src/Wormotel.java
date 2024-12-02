public class Wormotel {

    private Worm[][] rep;

    private void createNewRep() {
        this.rep = new Worm[6][8];

    }

    public Wormotel() {
        this.createNewRep();
    }

    public void populate(Worm x, Worm y, Worm z) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                this.rep[i][j] = x;
            }
        }

        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                this.rep[i][j] = y;
            }
        }

        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                this.rep[i][j] = z;
            }
        }
    }

    public void visualize(String option) {
        if (option.equals("Name")) {
            for (int i = 0; i < this.rep.length; i++) {
                for (int j = 0; j < this.rep[i].length; j++) {
                    System.out.print(this.rep[i][j].getName() + "|");
                }
                System.out.println();
            }
        }
        if (option.equals("Gene")) {
            for (int i = 0; i < this.rep.length; i++) {
                for (int j = 0; j < this.rep[i].length; j++) {
                    System.out.print(this.rep[i][j].getGene() + "|");
                }
                System.out.println();
            }
        }
        if (option.equals("Sleep")) {
            for (int i = 0; i < this.rep.length; i++) {
                for (int j = 0; j < this.rep[i].length; j++) {
                    System.out.print(this.rep[i][j].getSleep() + "|");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Wormotel x = new Wormotel();
        Worm a = new Worm1L("VC1", "unc-4", "Intestine", "22.7", "1");
        Worm b = new Worm1L("VC2", "unc-7", "Intestine", "31.7", "3");
        Worm c = new Worm1L("VC3", "ceg-3", "Neuron", "41.4", "8");
        x.populate(a, b, c);
        x.visualize("Sleep");

    }

}
