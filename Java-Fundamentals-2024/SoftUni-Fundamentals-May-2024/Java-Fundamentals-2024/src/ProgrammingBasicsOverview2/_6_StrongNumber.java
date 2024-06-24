package ProgrammingBasicsOverview2;

import java.util.Scanner;

public class _6_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int symbolSum = 1;
        int totalSum = 0;
        int inputNum = Integer.parseInt(input);


        for (int i = 0; i <= input.length() - 1 ; i++) {
            char symbol =  input.charAt(i);
            String digit = symbol + "";
            int num = Integer.parseInt(digit);
            for (int j = 1; j <= num ; j++) {
                symbolSum *= j;
            }
            totalSum += symbolSum;
            symbolSum = 1;
        }
        if (inputNum == totalSum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
