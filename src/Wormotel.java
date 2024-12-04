import worm.Worm;
import worm.Worm1L;

/**
 * Proof of concept of worm component.
 */

public class Wormotel {

    /**
     * Representation of a wormotel. A wormotel is essentially a 6 by 8 silicon
     * mold with wells that can store worms. Our lab then puts these worms under
     * a camera and measure the pixel movement of them to understand how they
     * sleep. Essentially, the wormotel is a 2d array with 6 rows and 8 columns.
     */
    private Worm[][] rep;

    /**
     *
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new Worm[6][8];

    }

    /**
     * No argument constructor.
     *
     */
    public Wormotel() {
        this.createNewRep();
    }

    /**
     * Populates the wormotel with 3 strains of worms. This is a very simple
     * approach and every 2 rows contains the same worm.
     *
     * @param x
     *            Strain of worm that can be inputted.
     * @param y
     *            Strain of worm that can be inputted as well.
     * @param z
     *            Strain of worm that can be inputted as well.
     */
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

    /**
     * Gets worm at specific well location.
     *
     * @param i
     * @param j
     * @return Worm at location.
     */
    public Worm getWorm(int i, int j) {
        return this.rep[i][j];
    }

    /**
     * Visualizes the wormotel based on name, gene or sleep score of the worm.
     *
     * @param option
     *            Input that decides how the matrix is visualized or ouputted.
     */

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

    /**
     * main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Wormotel x = new Wormotel();
        Worm a = new Worm1L("VC1", "unc-4", "Intestine", "22.7", "1");
        Worm b = new Worm1L("VC2", "unc-7", "Intestine", "31.7", "3");
        Worm c = new Worm1L("VC3", "ceg-3", "Neuron", "41.4", "8");
        x.populate(a, b, c);
        x.visualize("Sleep");
        x.visualize("Gene");
        x.visualize("Name");

    }

}
