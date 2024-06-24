package ProgrammingBasicsOverview2;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double priceForOne = 0.0;

        switch (typeOfGroup){
            case "Students":
                switch (dayOfWeek) {
                    case "Friday" -> priceForOne += 8.45;
                    case "Saturday" -> priceForOne += 9.8;
                    case "Sunday" -> priceForOne += 10.46;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday" -> priceForOne += 10.9;
                    case "Saturday" -> priceForOne += 15.6;
                    case "Sunday" -> priceForOne += 16;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday" -> priceForOne += 15;
                    case "Saturday" -> priceForOne += 20;
                    case "Sunday" -> priceForOne += 22.5;
                }
                break;
        }
        double totalPrice = people * priceForOne;

        if (typeOfGroup.equals("Students") && people >= 30){
            totalPrice = totalPrice * 0.85;
        } else if (typeOfGroup.equals("Buisness") && people >= 100) {
            totalPrice = totalPrice * 0 + (people - 10) * priceForOne; 
        } else if (typeOfGroup.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
