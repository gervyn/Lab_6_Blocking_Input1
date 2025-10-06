import java.util.Random;
import java.util.Scanner;


class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int secret = gen.nextInt(10) + 1;


        int guess = 0;
        boolean ok = false;
        String trash;


        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    ok = true;
                } else {
                    System.out.println("ERROR: Guess must be between 1 and 10 inclusive.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Please enter a whole number between 1 and 10.\n");
            }
        } while (!ok);


        System.out.println("Secret number was: " + secret);
        if (guess < secret) {
            System.out.println("Your guess was LOW.");
        } else if (guess > secret) {
            System.out.println("Your guess was HIGH.");
        } else {
            System.out.println("On the money! Nice job.");
        }
    }
}