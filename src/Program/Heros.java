package Program;

public class Heros extends Personnage {

    private int lootedCuir = 0;
    private int lootedOr = 0;

    public Heros(String nom) {
        super(nom);
    }

    public void loot(Monstre monstre){
        if(monstre instanceof Cuir){
            System.out.println("Trouvé : " + ((Cuir) monstre).getCuirPoss() + " Cuir");
            this.lootedCuir = this.lootedCuir+ ((Cuir) monstre).getCuirPoss();
        }
        if(monstre instanceof Or){
            System.out.println("Trouvé : " + ((Or) monstre).getOrPoss() + " Or");
            this.lootedOr = this.lootedOr + ((Or) monstre).getOrPoss();
        }
        //this.bag();
    }

    public void bag(){
        System.out.println("\nVous avez " + Color.ANSI_PURPLE + this.lootedCuir + " Cuirs" + Color.ANSI_RESET);
        System.out.println("Vous avez " + Color.ANSI_YELLOW + this.lootedOr + " Ors" + Color.ANSI_RESET);
    }
}
