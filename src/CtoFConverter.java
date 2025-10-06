import java.util.Scanner;


public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        boolean done = false;
        String trash;


        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear newline
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Please enter a numeric value (e.g., -17.5, 0, 36.6).\n");
            }
        } while (!done);


        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;


        System.out.printf("%.2f°C is %.2f°F%n", celsius, fahrenheit);


    }
}