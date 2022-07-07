package Program;

public class Personnage {
    private String nom;
    private int endurance, force, agility, vie;
    public boolean estvivant = true;

    Dice d4;
    Dice d6;

    public Personnage(String nom) {
        this.nom = nom;
        this.endurance = Dice.generate3Best();
        this.force = Dice.generate3Best();
        this.agility = Dice.generate3Best();
        this.vie = endurance+modifPV(this.endurance);
        d6 = new Dice(6);
        d4 = new Dice(4);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }


    public void frappe(Personnage cible){
        //Méthode Critique
//        int degatInit = d4.lance();
//        if(degatInit == 4){
//            degatInit += d4.lance();
//            System.out.printf(Color.ANSI_CYAN + "CRITICAL " + Color.ANSI_RESET);
//        }
//        int degat = degatInit+modifDegat(this.getForce());

        int degat = d4.lance()+modifDegat(this.getForce());

        cible.vie -= degat;
        System.out.println(this.getNom() + " inflige " + degat + " degats (" + cible.nom +":"+ cible.vie + ")");

        if(cible.vie <=0){
            if(cible instanceof Heros){
                defaite(cible);
            }
            else{
                cible.estvivant = false;
                victoire();
            }
        }
    }

    public void victoire(){
        System.out.println(Color.ANSI_GREEN + "\nVous avez gagné" + Color.ANSI_RESET);
        this.vie = this.getEndurance()+modifPV(this.getEndurance());
    }

    public void defaite(Personnage personnage){
        System.out.println(Color.ANSI_RED + "\nVous êtes mort" + Color.ANSI_RESET);
    }

//    public void sePresenter(String nom){
//        System.out.println(nom);
//        System.out.println("    - END : " + endurance);
//        System.out.println("    - FOR : " + force);
//        System.out.println("    - PV : " + vie);
//    }

    public int modifPV(int endu){
        return  (endu < 5) ? -1
                : (endu < 10) ? 0
                : (endu < 15) ? 1
                : 2;
    }

    public int modifDegat(int str){
        return  (str < 5) ? -1
                : (str < 10) ? 0
                : (str < 15) ? 1
                : 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ", endurance=" + getEndurance() +
                ", force=" + getForce() +
                ", agility=" + getAgility() +
                ", vie=" + getVie() ;
    }
}
