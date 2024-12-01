import components.standard.Standard;

public interface WormKernel extends Standard<WormKernel> {

    boolean isMutated();

    boolean isSleep();

    void set(int var1, String var2);

    String get(int var1);

}