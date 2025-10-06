import java.util.Scanner;

class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        boolean okW = false, okH = false;
        String trash;


        do {
            System.out.print("Enter the rectangle width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) okW = true; else System.out.println("ERROR: Width must be > 0.\n");
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Enter a numeric value for width.\n");
            }
        } while (!okW);


        do {
            System.out.print("Enter the rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) okH = true; else System.out.println("ERROR: Height must be > 0.\n");
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("ERROR: Enter a numeric value for height.\n");
            }
        } while (!okH);


        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.hypot(width, height); // sqrt(w^2 + h^2)

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);


    }
}