import java.util.*;

public class Lab3_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of a purchase: ");
        double price = input.nextDouble();

        double state_tax = price * 0.04;
        double county_tax = price *  0.02;
        double total_tax = state_tax + county_tax;
        double total_price = price + total_tax;

        System.out.printf("Your total for today's purchase is: $ %.2f", total_price);

    }
}
