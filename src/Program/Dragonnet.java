package Program;

public class Dragonnet extends Monstre implements Or, Cuir{

    private int cuirPoss;
    private int orPoss;

    public Dragonnet() {
        super("Dragonnet");
        this.cuirPoss = d4.lance();
        this.orPoss = d6.lance();
    }

    @Override
    public int getEndurance() {
        return super.getEndurance()+1;
    }

    @Override
    public int getCuirPoss() {
        return cuirPoss;
    }

    @Override
    public void setCuirPoss(int cuirPoss) {
        this.cuirPoss = cuirPoss;
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
