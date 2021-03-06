package rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

public class NewGame {
    public static void main(String[] args) {
        runnable();
    }
    private static void repeatGame(String x){
        if(x.equals("yes")){
            runnable();
        }
        else{
            System.out.println("Thanks for playing");
        }
    }
    private static void runnable(){
        Scanner grabAction = new Scanner(System.in);
        Random rand = new Random();
        int playerWins = 0;
        int cpuWins = 0;
        int draw = 0;
        boolean isNumber = false;
        boolean isValid = false;

        System.out.println("How many round would you like too play?");
        int rounds = grabAction.nextInt();

        //Checks to see if the user entered the correct values
        while(isNumber == false){
            if(rounds >= 1 && rounds <= 10){
                isNumber = true;
            }
            else{
                System.out.println("Please Enter a number between 1-10");
                rounds = grabAction.nextInt();
            }
        }

        System.out.println("Rock = 0, Paper = 1, Scissors = 2");

        for(int i = 0;i<rounds;i++){
            System.out.println("Player 1: Rock, Paper or Scissors?");
            int playerGuess = grabAction.nextInt();

            while(isValid == false){
                if(playerGuess >= 0 && playerGuess <= 2){
                    isValid = true;
                }
                else{
                    System.out.println("Please Enter a number between 0-2");
                    playerGuess = grabAction.nextInt();
                }
            }

            int computerGuess = rand.nextInt(3);
            System.out.println(computerGuess);
            if(playerGuess == computerGuess){
                System.out.println("Its a Draw!");
            }
            else if(playerGuess == 0 && computerGuess == 2 || (playerGuess == 1 && computerGuess == 0) || (playerGuess == 2 && computerGuess == 1)){
                System.out.println("You won!");
                playerWins +=1;
            }
            else{
                System.out.println("You lost!");
                cpuWins +=1;
            }
        }
        if(playerWins > cpuWins){
            System.out.println("You win!");
        }
        else if(cpuWins > playerWins){
            System.out.println("You lose");
        }
        else{
            System.out.println("Its a tie!");
        }
        System.out.println("You have scored: "+playerWins+ " and the bot scored: "+cpuWins + " with "+ draw+ " ties");
        System.out.println("'yes' or 'no' to play again!");
        String playerResponse = grabAction.next();
        repeatGame(playerResponse);
    }
}
