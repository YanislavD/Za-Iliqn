package ProgrammingBasicsOverview;

import java.util.Scanner;

public class _7_TypeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int singleTicket = 0;

        switch (typeOfDay){
            case "Weekday":
                if (age >= 0 && age <= 18){
                    singleTicket = 12;
                } else if (age > 18 && age <= 64) {
                    singleTicket = 18;
                } else if (age > 64 && age <= 122) {
                    singleTicket = 12;
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18){
                    singleTicket = 15;
                } else if (age > 18 && age <= 64) {
                    singleTicket = 20;
                } else if (age > 64 && age <= 122) {
                    singleTicket = 15;
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    singleTicket = 5;
                } else if (age > 18 && age <= 64) {
                    singleTicket = 12;
                } else if (age > 64 && age <= 122) {
                    singleTicket = 10;
                } else {
                    System.out.println("Error!");
                }
                break;
        }
        if (age >= 0 && age <= 122){
            System.out.println(singleTicket +"$");
        }
    }
}
