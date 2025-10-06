import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;

        boolean okGallons = false;
        boolean okMpg = false;
        boolean okPrice = false;

        String trash;

        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear newline
                if (gallons >= 0) {
                    okGallons = true;
                } else {
                    System.out.println("ERROR: Gallons cannot be negative.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Enter a numeric value for gallons.\n");
            }
        } while (!okGallons);


        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear newline
                if (mpg > 0) {
                    okMpg = true;
                } else {
                    System.out.println("ERROR: MPG must be greater than 0.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Enter a numeric value for MPG.\n");
            }
        } while (!okMpg);

        // ---- Input: price of gas per gallon (double, >= 0) ----
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear newline
                if (pricePerGallon >= 0) {
                    okPrice = true;
                } else {
                    System.out.println("ERROR: Price cannot be negative.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Enter a numeric value for price.\n");
            }
        } while (!okPrice);

        double costFor100 = (100.0 / mpg) * pricePerGallon;

        double maxDistance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costFor100);
        System.out.printf("Maximum distance on current tank: %.2f miles%n", maxDistance);
    }
}

