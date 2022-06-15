package healthyhearts;
import java.util.Scanner;

public class gameThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your age?");
        int playerResponse = scan.nextInt();
        int max = 220-playerResponse;

        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        System.out.println("The target heart rate zone is the " + getPercent(50,max) + " - " + getPercent(85,max) + " of the maximum.");
    }
    private static int getPercent(double percent, int max){
        double decPercent = percent/100;
        double a = decPercent * max;
        return (int) Math.round(a);
    }
}
