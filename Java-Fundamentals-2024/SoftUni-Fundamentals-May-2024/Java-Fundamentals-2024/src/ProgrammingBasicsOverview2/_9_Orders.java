package ProgrammingBasicsOverview2;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule;
        int days;
        int capsulesCount;
        double totalPrice = 0;

        for (int i = 1; i <= orders; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            totalPrice = totalPrice + ((days * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f %n", ((days * capsulesCount) * pricePerCapsule));
        }

        System.out.printf("Total: $%.2f ", totalPrice);

    }
}
