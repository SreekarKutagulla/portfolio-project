package components.worm;

public interface Worm extends WormKernel {

    void setName(String var1);

    void setGene(String var1);

    void setOrtholog(String var1);

    String getName();

    String getGene();

    String getOrtholog();

    void addSleep(int x);

    void addGen(int x);

}