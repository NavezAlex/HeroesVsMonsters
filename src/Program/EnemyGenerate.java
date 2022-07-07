package Program;

import java.util.Random;

public class EnemyGenerate {

    public static Monstre findFight(){
        Monstre find = null;

        Random rng = new Random();
        int rngMonstre = rng.nextInt(3);

        switch (rngMonstre){
            case 0:
                find = new Loup();
                break;
            case 1:
                find = new Orc();
                break;
            case 2:
                find = new Dragonnet();
                break;
        }
        return find;
    }

}
