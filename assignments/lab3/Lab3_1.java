import java.util.*;

public class Lab3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of miles driven: ");
        double miles = input.nextDouble();

        System.out.print("Gallons of gas used: ");
        double gallons = input.nextDouble();

        double MPG = miles/gallons;

        System.out.printf("Your car's mpg is %.2f", MPG);
    }
}
