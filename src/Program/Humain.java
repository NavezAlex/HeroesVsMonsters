package Program;

public class Humain extends Heros {

    public Humain() {
        super("Humain");
    }

    @Override
    public int getEndurance() {
        return super.getEndurance()+1;
    }

    @Override
    public int getForce() {
        return super.getForce()+1;
    }
}
