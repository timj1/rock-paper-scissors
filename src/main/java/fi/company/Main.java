
package fi.company;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1) rock, 2) paper, 3) scissors?");
        int pelaaja = 0;
        int pelaajaAi = 0;
        do {
            System.out.println("Choose your weapon:");
            String valinta = input.nextLine();
            try {
                if(!valinta.equals("rock") && !valinta.equals("paper") && !valinta.equals("scissors")) {
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("Choose rock, paper or scissors");
                continue;
            }

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

        System.out.println("-------------------------------");
        System.out.println("Pelaaja " + pelaaja + " tietokone " + pelaajaAi);
        if(pelaaja < pelaajaAi) {
            System.out.println("Computer won the match!");
        } else {
            System.out.println("You won the match!");
        }
        System.out.println("-------------------------------");
        
    }
}