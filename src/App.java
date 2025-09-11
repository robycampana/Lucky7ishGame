import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int randomN1;
        int randomN2;
        int randomN3;
        // String money = "5";

        System.out.println("Press enter to play");
        String start = in.nextLine();

        System.out.println("Lucky 7-ish Game");
        System.out.println("Every game costs 1 euro,");
        System.out.println("if one of the numbers is a 7, then you win 3 euro.");
        System.out.println("If 2 of the numbers are 7s, then you win 5 euro.");
        System.out.println("And if all of the numbers are 7, then you win 10 euro");




        System.out.println("How money do you want to use?");
        String money = in.nextLine();
        int cash = Integer.parseInt(money);

        


        randomN1 = random.nextInt(11);
        System.out.println("Random number between 0-10: " + randomN1);

        randomN2 = random.nextInt(11);
        System.out.println("Random number between 0-10: " + randomN2);

        randomN3 = random.nextInt(11);
        System.out.println("Random number between 0-10: " + randomN3);

        if (randomN1 == 7 || randomN2 == 7 || randomN3 == 7) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!"); 
        }
    }
}
