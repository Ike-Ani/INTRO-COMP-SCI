import java.util.*;

public class Lab3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Price of a circuit board: ");
        double price = input.nextDouble();

        double profit;
        profit = price * 0.4;

        System.out.printf("Total profit from product: %.2f", profit);

    }
}
