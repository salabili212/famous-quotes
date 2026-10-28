package com.plurasight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] quotes ={"Small steps still move you forward.","Progress takes patience.",
        "Start where you are.","Your effort matters.","Keep learning, keep growing.","One setback isn’t the end.",
                "Make today count.", "Rest, then try again.", "Courage grows with practice."
        ,"Be proud of your progress."};
        int index = 99;
        do {
            try {
                System.out.println("Enter a number from 1-10 to see a quote. ");
                index = scanner.nextInt();
                index--;
                System.out.println(quotes[index]);
                System.out.println("Enter 99 to stop the program. Or any other number to see more quotes.");
                index = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("The number does not exist. " +
                        "please enter a number  from 1 - 10.");
            }
        }while(index != 999);

    }
}
