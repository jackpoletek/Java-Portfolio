package com.math;

import java.util.ArrayList;

public class RandomNumber {

    private ArrayList<Integer> randomArray = new ArrayList<>();
    private int firstNumber;

    public ArrayList<Integer> getRandomArray() {
        return randomArray;
    }

    public int generateRandomNumber() {
        firstNumber = (int) (Math.random()*899) + 100;
        randomArray.add(firstNumber);
        return firstNumber;
    }

    public void printRandomNumber() {
        System.out.println("I'll start by giving you the first number out of 5:");
        for(int i = 0; i < randomArray.size(); i++) {
            System.out.println(randomArray.get(i));
        }
    }
}
