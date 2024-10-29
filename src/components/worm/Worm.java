package components.worm;

public interface Worm<String> extends WormKernel<String> {

    void setName(String var1);

    void setGene(String var1);

    void setOrtholog(String var1);

    String getName();

    String getGene();

    String getOrtholog();

    void addSleep(int var1);

    void addGen(int var1);

}