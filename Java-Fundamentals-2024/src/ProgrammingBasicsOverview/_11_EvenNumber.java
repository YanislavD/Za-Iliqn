package ProgrammingBasicsOverview;

import java.util.Scanner;

public class _11_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int absValue = Math.abs(scanner.nextInt());

        while (absValue % 2 != 0){
            System.out.println("Please write an even number.");
            absValue = Math.abs(scanner.nextInt());
        }

        System.out.printf("The number is: %d", absValue);

    }
}
