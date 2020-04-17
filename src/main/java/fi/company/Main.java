
package fi.company;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int pelaaja = 0;
        int pelaajaAi = 0;
        do {
            System.out.println("Choose your weapon:");
            String valinta = input.nextLine();

            String tietokone = "";
            int number = (int) (Math.random() * 3);
            if(number < 1) {
                tietokone = "rock";
            } else if(number < 2) {
                tietokone = "paper";
            } else {
                tietokone = "scissors";
            }
            System.out.println("Computer chose " + tietokone);
            if(!valinta.equals(tietokone)) {
                if(valinta.equals("rock") && tietokone.equals("paper")) {
                    System.out.println("Computer won!");
                    pelaajaAi++;
                } else if (valinta.equals("paper") && tietokone.equals("scissors")) {
                    System.out.println("Computer won!");
                    pelaajaAi++;
                } else if (valinta.equals("scissors") && tietokone.equals("rock")) {
                    System.out.println("Computer won!");
                    pelaajaAi++;
                } else {
                    System.out.println("You won!");
                    pelaaja++;
                }
            } else {
                System.out.println("Tie!");
            }
        } while(pelaaja != 3 && pelaajaAi !=3);

        System.out.println("Pelaaja " + pelaaja + " tietokone " + pelaajaAi);
        if(pelaaja < pelaajaAi) {
            System.out.println("Computer won!");
        } else {
            System.out.println("You won!");
        }
        
    }
}