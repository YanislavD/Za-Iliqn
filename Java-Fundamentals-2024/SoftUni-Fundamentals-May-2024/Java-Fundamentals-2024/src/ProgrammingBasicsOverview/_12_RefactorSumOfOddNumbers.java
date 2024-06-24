package ProgrammingBasicsOverview;

import java.util.Scanner;

public class _12_RefactorSumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddNumbers = Integer.parseInt(scanner.nextLine());

        int num = 1;
        int sum = 0;

        for (int i = 0; i < oddNumbers; i++) {
            sum+=num;
            System.out.println(num);
            num+=2;
        }
        System.out.println("Sum: " + sum);
    }
}
