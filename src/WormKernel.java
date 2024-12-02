import components.standard.Standard;

/**
 * Worm kernel components with primary methods.
 */

public interface WormKernel extends Standard<Worm> {

    /**
     * Checks if object has a gene.
     * 
     * @return true if string is not empty.
     */
    boolean isMutated();

    /**
     * Checks if object has a sleep score.
     * 
     * @return true if string is not empty.
     */
    boolean isSleep();

    /**
     * Finds and replaces one of the values of the Worm object.
     *
     * @updates this
     *
     * @param var1
     *            Index of the object array.
     * @param var2
     *            What will replace the old value.
     */
    void set(int var1, String var2);

    /**
     * Retrieves a certain value of the Worm object.
     *
     * @param var1
     *            Index of the object array.
     * @return what is located at the index.
     */
    String get(int var1);

}