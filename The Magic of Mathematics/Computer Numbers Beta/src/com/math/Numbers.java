package com.math;

public class Numbers {

    private int random;
    private int result;
    private final int ALGO = 2000 - 2;

    private final String[] INTRODUCTION = {"Do you think mathematics is boring?", "Let's play a game of numbers.",
                                            "I've thought of a number and I'll show it to you later."};

    private final String[] RESULT = {"Okay, that'll do. I'm sure you'll agree I had no idea what numbers you're going to enter.",
                                        "Check again the total of all 5 numbers.", "The number I had on my mind was"};

    private UserNumbers userNumbers = new UserNumbers();
    private ComputerNumbers computerNumbers = new ComputerNumbers();
    private RandomNumber randomNumber = new RandomNumber();

    public void run() throws InterruptedException {
        displayIntroduction();
        randomNumber.generateRandomNumber();
        randomNumber.printRandomNumber();
        computerNumbers.userInput();
        computerNumbers.generateCompNumbers();
        computerNumbers.arrayToString();
        computerNumbers.stringToInt();
        computerNumbers.printCompNumbers();
        printAllNumbers();
        calculateResult();
        printResult();
    }

    public void close() {
        computerNumbers.close();
    }

    public void displayIntroduction() throws InterruptedException {
        for(int i = 0; i < INTRODUCTION.length; i++) {
            System.out.printf("%s\n", INTRODUCTION[i]);
            Thread.sleep(4000);
        }
    }

    public void printAllNumbers() throws InterruptedException {
        System.out.println("Check all the 5 numbers below, including the first one I gave you. Calculate the total:");
        randomNumber.getRandomArray().stream().forEach(System.out::println);
        computerNumbers.getUserNumbers().stream().forEach(System.out::println);
        computerNumbers.getCompNumbers().stream().forEach(System.out::println);
        Thread.sleep(10000);
    }

    public int calculateResult() {
        random = randomNumber.getRandomArray().get(0);
        result = random + ALGO;
        return result;
    }

    public void printResult() throws InterruptedException {
        for(int i = 0; i < RESULT.length; i++) {
            System.out.printf("%s\n", RESULT[i]);
            Thread.sleep(5000);
        }
        System.out.println(result);
        Thread.sleep(3000);
        System.out.println("What do you think of mathematics now?");
    }
}
