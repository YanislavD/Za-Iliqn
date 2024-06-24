package ProgrammingBasicsOverview2;

import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double acceptedSum = 0;

        while (!input.equals("Start")){
            double coin  = Double.parseDouble(input);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2 ){
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                acceptedSum = acceptedSum +  coin;
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")){

            if (product.equals("Nuts") && acceptedSum >= 2){
                acceptedSum =acceptedSum - 2;
                System.out.println("Purchased Nuts");
            } else if (product.equals("Water") && acceptedSum >= 0.7){
                acceptedSum = acceptedSum - 0.7;
                System.out.println("Purchased Water");
            } else if (product.equals("Crisps") && acceptedSum >= 1.5) {
                acceptedSum = acceptedSum - 1.5;
                System.out.println("Purchased Crisps");
            } else if (product.equals("Soda") && acceptedSum >= 0.8) {
                acceptedSum = acceptedSum - 0.8;
                System.out.println("Purchased Soda");
            } else if (product.equals("Coke") && acceptedSum >= 1) {
                acceptedSum = acceptedSum - 1;
                System.out.println("Purchased Coke");
            } else {
                System.out.println("Sorry, not enough money");
            }

            if (!product.equals("Soda") && !product.equals("Coke") && !product.equals("Water") && !product.equals("Crisps") && !product.equals("Nuts")){
                System.out.println("Invalid product");
                continue;
            }
            product = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", acceptedSum);
    }
}
