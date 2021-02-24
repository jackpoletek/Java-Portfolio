package com.math;

import java.util.ArrayList;
import java.util.Scanner;

public class UserNumbers {

    private Scanner sc = new Scanner(System.in);
    private int value;

    private ArrayList<Integer> userNumbers = new ArrayList<>();

    public ArrayList getUserNumbers() {
        return userNumbers;
    }

    public int userInput() {

        int counter = 0;

        String[] line = new String[3];

        System.out.println("Now you need to enter 2 numbers. The numbers must be between 100 and 899:");

        for(int i = 0; i < 2; i++) {
            do {
                try {
                    line[i] = sc.nextLine();
                    value = Integer.parseInt(line[i]);

                    if (value > 899) {
                        System.out.println("The number mustn't be greater than 899.");
                        System.out.println("Try again.");
                        continue;
                    }
                    if (value < 100) {
                        System.out.println("The number must greater than 100.");
                        System.out.println("Try again.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }
                counter++;

            } while (counter < 1);

            addUserNumbers();
        }
        return value;
    }
    public void close() {
        sc.close();
    }

    public void addUserNumbers() {
        userNumbers.add(value);
    }
    public void printUserNumbers() {
        System.out.println("The numbers you entered: ");
        userNumbers.forEach(System.out::println);
    }
}
