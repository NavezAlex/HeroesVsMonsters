package Program;

public class Loup extends Monstre implements Cuir{

    private int cuirPoss;

    public Loup() {
        super("Loup");
        this.cuirPoss = d4.lance();
    }

    @Override
    public int getCuirPoss() {
        return cuirPoss;
    }

    @Override
    public void setCuirPoss(int cuirPoss) {
        this.cuirPoss = cuirPoss;
    }

}
