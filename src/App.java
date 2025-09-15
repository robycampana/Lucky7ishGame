import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        //int money;

        System.out.println("Press enter to play");
        String start = in.nextLine();

        System.out.println("Welcome to Lucky 7 Game");
        System.out.println("Every game costs 1 €,");
        System.out.println("if one of the numbers is a 7, then you win 3 euro.");
        System.out.println("If 2 of the numbers are 7s, then you win 5 euro.");
        System.out.println("And if all of the numbers are 7, then you win 10 euro");




        System.out.println("How much do you want to play with?");
        String amount = in.nextLine();
        int money = Integer.parseInt(amount);

       

       
        
        //String amount = Integer.parseInt(amount);

        boolean playAgain = true;

        while (playAgain && money > 0) {
            // System.out.println("You have " + money + " euros\n");
            money -= 1; 
            
        n1 = random.nextInt(11);
        n2 = random.nextInt(11);
        n3 = random.nextInt(11);

        System.out.println("Random numbers between 0-10:\n " + n1 + "\n " + n2 + "\n " + n3);
       
        
        //count how many 7s
        int sevens = 0;
        if (n1 == 7) sevens++;
        if (n2 == 7) sevens++;
        if (n3 == 7) sevens++;
        
        //check winnings
        if (sevens == 1){
            System.out.println("You got one 7! You win 3 euros");
            money += 3;
        }
        else if (sevens == 2){
            System.out.println("You got two 7s! You win 5 euros");
            money += 5;
        }
        else if (sevens == 3){
            System.out.println("GRAND PRIZE!! You win 10 euros");
            money += 10;
        }
        else if (sevens == 0) {
            System.out.println("No wins, try again.");
        }

        if (money <= 0){
            System.out.println("\nGame Over, You don't have enough money");
            break;
        }

        //ask to play again
        System.out.println("You have " + money + " left. Do you want to play again? (y/n)");
        String choice = in.nextLine();
        if (!choice.equalsIgnoreCase("yes")) {
            playAgain = false;
        }
        
        System.out.println("Thank you for playing. You earned " + money + " euros");
             
        }
           

    }
}
