import java.util.*;

import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter test score #1: ");
        int score = input.nextInt();

        System.out.print("Enter test score #2: ");
        int score2 = input.nextInt();

        System.out.print("Enter test score #3: ");
        int score3 = input.nextInt();

        int sum = score + score2 + score3;
        double avg = sum / 3.0;

        System.out.printf("Average score: %.2f", avg);

    }
}
