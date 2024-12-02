public class Wormotel {



    public static void main(String[] args) {
        Worm1L x = new Worm1L("VC1", "", "", "22.7", "1");
        x.setGene("VC2");
        x.addGen(1);
        System.out.println(x.get(4));
    }

}
