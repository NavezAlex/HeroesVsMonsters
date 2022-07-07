package Program;

public class Dragon extends Monstre implements Or, Cuir{

    private int cuirPoss;
    private int orPoss;

    public Dragon() {
        super("Dragon");
        this.cuirPoss = (d4.lance())*2;
        this.orPoss = (d6.lance())*2;
    }

    @Override
    public int getEndurance() {
        return super.getEndurance()+3;
    }

    @Override
    public int getForce() {
        return super.getForce()+3;
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
