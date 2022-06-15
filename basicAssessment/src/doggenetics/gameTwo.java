package doggenetics;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gameTwo {
    public static void main(String[] args) {

        int[] intArray = new int[5];
        Random rand = new Random();
        int computerGuess;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats the name of your dog?");
        String playerResponse = scan.next();

        for (int i = 0; i <= 4; i++) {
            if(i >= 1){
                computerGuess = rand.nextInt(100-count);
                count += computerGuess;
            }
            else{
                computerGuess = rand.nextInt(100);
                count = computerGuess;
            }
            intArray[i] = computerGuess;

            if (i == 4) {
                    count -= computerGuess;
                    intArray[i] = (100-count);
            }
        }
        System.out.println("Lab results for " + playerResponse);
        System.out.println(intArray[0] + "% St. Bernard");
        System.out.println(intArray[1] + "% Chiuahua");
        System.out.println(intArray[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(intArray[3] + "% Common Cur");
        System.out.println(intArray[4] + "% King Doberman");
        System.out.println("Wow! that's quite a dog!");
    }
}
