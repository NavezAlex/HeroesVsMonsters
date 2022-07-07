package Program;

import java.util.Arrays;
import java.util.Random;

public class Dice {

    Random rand = new Random();
    private int min, max;

    public Dice(int max) {
        this.min = 1;
        this.max = max;
    }

    public int lance(){
        return rand.nextInt(max)+min;
    }

    public static int generate3Best(){
        final int nbD = 4;
        Dice d = new Dice(6);
        Integer[] tab = new Integer[4];

        for (int i = 0; i < nbD; i++) {
            tab[i] = d.lance();
        }
        Arrays.sort(tab);

        return tab[1]+tab[2]+tab[3];
    }

}
