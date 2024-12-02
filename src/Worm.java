public interface Worm extends WormKernel {

    /**
     * Replaces the name of {@code this}.
     *
     * @updates this
     *
     * @param var1
     *            Name input to replace orginal
     */
    void setName(String var1);

    /**
     * Replaces the gene of {@code this}.
     *
     * @updates this
     *
     * @param var1
     *            Gene input to replace orginal
     */
    void setGene(String var1);

    /**
     * Replaces the ortholog of {@code this}.
     *
     * @updates this
     *
     * @param var1
     *            Ortholog input to replace orginal
     */
    void setOrtholog(String var1);

    /**
     * Replaces the sleep of {@code this}.
     *
     * @updates this
     *
     * @param var1
     *            Sleep input to replace orginal
     */
    void setSleep(String var1);

    /**
     * Gets the name of {@code this}.
     *
     * @return name of Worm
     */
    String getName();

    /**
     * Gets the gene of {@code this}.
     *
     * @return gene mutated of Worm
     */
    String getGene();

    /**
     * Gets the ortholog of {@code this}.
     *
     * @return ortholog of Worm
     */
    String getOrtholog();

    /**
     * Gets the sleep of {@code this}.
     *
     * @return sleep of Worm
     */
    String getSleep();

    /**
     * User can add to the generation of the worm to track how many times it has
     * been tested.
     *
     * @updates this
     *
     * @param var1
     *            User input to add to generation
     *
     */
    void addGen(int var1);

}