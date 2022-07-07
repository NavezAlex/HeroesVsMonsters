package Program;

public class Nain extends Heros {

    public Nain() {
        super("Nain");
    }

    @Override
    public int getEndurance() {
        return super.getEndurance() + 2;
    }
}
