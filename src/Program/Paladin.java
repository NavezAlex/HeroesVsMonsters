package Program;

public class Paladin extends Heros {

    public Paladin() {
        super("Paladin");
    }

    @Override
    public int getEndurance() {
        return super.getEndurance()+8;
    }

    @Override
    public int getForce() {
        return super.getForce()+8;
    }

    @Override
    public int getVie() {
        return super.getVie()+8;
    }
}
