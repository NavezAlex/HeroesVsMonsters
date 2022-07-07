package Program;

public class Orc extends Monstre implements Or{

    private int orPoss;


    public Orc() {
        super("Orc");
        this.orPoss = d6.lance();
    }

    @Override
    public int getForce() {
        return super.getForce()+1;
    }


    @Override
    public int getOrPoss() {
        return orPoss;
    }

    @Override
    public void setOrPoss(int orPoss) {
        this.orPoss = orPoss;
    }
}
