package ProgrammingBasicsOverview;

import java.util.Scanner;

public class _4_TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;
        if (minutes >= 60){
            minutes -= 60;
            hours++;
        }
        if (hours == 24){
            hours = 0;
        }

        if (minutes < 10){
            System.out.printf("%d:%02d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours,minutes);
        }
    }
}
