package rockpaperscissors;

/**
 * Created by Ryan on 3/31/2016.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class RPSmoderate {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner player = new Scanner(System.in );
        Random rando = new Random(); //used to select random # for cpu
        int input; // used for user input
        int B = 1;
        System.out.println("Welcome");
        System.out.println("Pick 1, 2, or 3 for : ROCK (1), PAPER(2), or SCISSORS (3)");

        // to keep track of your wins and losses
        int wins = 0;
        int losses = 0;
        int ties = 0;

        while (B != 0) {
            //user chooses rock paper scissors by number
            int Rock = 1;
            int Paper = 2;
            int Scissor = 3;


                         //the next # that the user inputs will be stored in input
            input = player.nextInt();
                        //chooses number from 0 to 99, assigns it to int variable
            int randomNumber = rando.nextInt(100);
                       //32% chance she picks rock
            if (randomNumber < 32){
                randomNumber = 1;
            }
                    //33% she picks paper
            if (randomNumber < 65){
                randomNumber = 2;
            }
                    //35% she picks scissors
            if (randomNumber < 101){
                randomNumber = 3;
            }
            if (randomNumber == Rock) {
                if (input == Rock) {
                    System.out.println("Rock Vs. Rock: TIE");
                    ties++;
                } else if (input == Paper) {
                    System.out.println("Paper Vs. Rock: YOU WIN");
                    wins++;
                } else if (input == Scissor) {
                    System.out.println("Scissor Vs. Rock: YOU LOSE");
                    losses++;
                }
            } else if (randomNumber == Paper) {
                if (input == Rock) {
                    System.out.println("Rock Vs. Paper: YOU LOSE");
                    losses++;
                } else if (input == Paper) {
                    System.out.println("Paper Vs. Paper: TIE");
                    ties++;
                } else if (input == Scissor) {
                    System.out.println("Scissor Vs. Paper: YOU WIN");
                    wins++;
                }

            } else if (randomNumber == Scissor) {
                if (input == Rock) {
                    System.out.println("Rock Vs. Scissor: YOU WIN");
                    wins++;
                } else if (input == Paper) {
                    System.out.println("Paper Vs. Scissor: YOU LOSE");
                    losses++;
                } else if (input == Scissor) {
                    System.out.println("Scissor Vs. Scissor: TIE");
                    ties++;
                }
            }
            System.out.println("wins: "+wins);
            System.out.println("losses: "+losses);
            System.out.println("ties: "+ties);


        }
    }

}