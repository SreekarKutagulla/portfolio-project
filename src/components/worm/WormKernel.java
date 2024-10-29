package components.worm;

import components.standard.Standard;

public interface WormKernel<String> extends Standard<WormKernel<String>> {

    boolean isMutated();

    boolean isSleep();

    void set(int var1, String var2);

    void get(int var1);

}