import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int randomN1;
        int randomN2;
        int randomN3;

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
