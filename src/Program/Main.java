package Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez votre race : \n 1 - Humain \n 2 - Nain \n 3 - Paladin");
        String raceChoice = sc.nextLine();

        while (!raceChoice.equals("1")  && !raceChoice.equals("2") && !raceChoice.equals("3")){
            System.out.println("Choix Incorrect. Veuillez choisir entre : \n 1 - Humain \n 2 - Nain \n 3 - Paladin");
            raceChoice = sc.nextLine();
        }

        Heros heros = (raceChoice.equals("1")) ? new Humain()
                    : (raceChoice.equals("2")) ? new Nain()
                    : new Paladin();

        System.out.println(heros.toString());


        int counter = 0;
        int L_count = 0;
        int O_count = 0;
        int Dt_count = 0;
        int Dr_count = 0;
        Monstre enemy;

        while(heros.getVie() > 0){
            counter++;
            if(counter % 10 == 0){
                enemy = new Dragon();
                System.out.println(Color.ANSI_RED + "\nATTENTION : LE BOSS ARRIVE - " + enemy.getNom().toUpperCase() + Color.ANSI_RESET);
            }else {
                enemy = EnemyGenerate.findFight();
            }

            System.out.println("\nVous rencontrez un " + enemy.getNom());
            System.out.println(enemy.toString());

            while (heros.getVie() > 0 && enemy.estvivant){
                if(heros.getAgility() >= enemy.getAgility()){
                    heros.frappe(enemy);
                    if(enemy.getVie() > 0){
                        enemy.frappe(heros);
                    }
                }
                else {
                    enemy.frappe(heros);
                    if(heros.getVie() > 0){
                        heros.frappe(enemy);
                    }
                }
            }
            if(!enemy.estvivant){
                heros.loot(enemy);

                if(enemy.getNom().equals("Loup")){ L_count++; }
                if(enemy.getNom().equals("Orc")){ O_count++; }
                if(enemy.getNom().equals("Dragonnet")){ Dt_count++; }
                if(enemy.getNom().equals("Dragon")){ Dr_count++; }

            }
            if(heros.getVie() <= 0){
                System.out.println("Vous avez gagné " + (counter-1) + " combats avant de mourrir");

                if(counter-1 > 0){
                    heros.bag();

                    String message = "\nVous avez battu : ";
                    if(L_count > 0 ){ message += " \n" + L_count + " Loups"; }
                    if(O_count > 0 ){ message += " \n" + O_count + " Orcs"; }
                    if(Dt_count > 0 ){ message += " \n" + Dt_count + " Dragonnets"; }
                    if(Dr_count > 0 ){ message += " \n" + Dr_count + " Dragon"; }
                    System.out.println(message);
                }
                else{
                    System.out.println("Vous n'aviez rien sur vous à votre mort.");
                }
            }
        }

    }
}
