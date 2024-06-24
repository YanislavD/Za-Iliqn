package ProgrammingBasicsOverview2;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char symbol = username.charAt(i);
            password = password + symbol;
        }

        int counterIncorrectPass = 0;
        String inputPass = scanner.nextLine();
        while (!inputPass.equals(password)){
            counterIncorrectPass++;
            if(counterIncorrectPass == 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");

            inputPass = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);

    }
}
