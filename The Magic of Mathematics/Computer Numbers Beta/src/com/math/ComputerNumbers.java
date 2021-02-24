package com.math;

import java.util.ArrayList;

public class ComputerNumbers extends UserNumbers {

    private UserNumbers user = new UserNumbers();
    private ArrayList numbers = getUserNumbers(); // array for storing user numbers

    private ArrayList<Integer> tempArray = new ArrayList<>();
    private ArrayList<Integer> compNumbers = new ArrayList<>();

    public ArrayList getCompNumbers() {
        return compNumbers;
    }

    //private int total;

    private int compNumber;
    private final int UPPER_LIMIT = 9;

    private String first_3;
    private String last_3;

    private String toString;
    private String[] splitNumber;

    // converting the elements of ArrayList to String
    public void arrayToString() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int indexLength = 3;
        int[] indexRange1 = {tempArray.get(0), tempArray.get(1), tempArray.get(2)};
        int[] indexRange2 = {tempArray.get(3), tempArray.get(4), tempArray.get(5)};

        for (int i = 0; i < indexLength; i++) {
            sb1.append(indexRange1[i]);
            sb2.append(indexRange2[i]);
        }
        first_3 = sb1.toString();
        last_3 = sb2.toString();
    }

    // converting String to int
    public void stringToInt() {

        int toInt1 = Integer.parseInt(first_3.trim());
        int toInt2 = Integer.parseInt(last_3.trim());

        compNumbers.add(toInt1);
        compNumbers.add(toInt2);
    }

    public String convertToString (ArrayList numbers) {

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
        }
        toString = sb.toString();
        return toString;
    }

    public String[] splitNumbers(ArrayList numbers) {

        convertToString(numbers);
        splitNumber = new String[toString.length()];

        for (int i = 0; i < toString.length(); i++) {
            splitNumber = toString.split("");
        }
        return splitNumber;
    }

    public int generateCompNumbers() {

        String[] no = splitNumbers(numbers);

        for (int i = 0; i < no.length; i++) {
            compNumber = UPPER_LIMIT - Integer.parseInt(no[i]);
            addCompNumbers(compNumber);
        }
        return compNumber;
    }

    public void addCompNumbers(int compNumber) {
        tempArray.add(compNumber);
    }

    public void printCompNumbers() {

        System.out.println("Here are my numbers:");
        compNumbers.stream().forEach(System.out::println);
    }

    @Override
    public void printUserNumbers() {
        System.out.println("You entered:");
        numbers.forEach(n -> System.out.println(n));
    }
    /*
    public int sumOfElements() {

        int sumOfUserArray = numbers.stream()
                .mapToInt(n -> (int) n)
                .sum();

        int sumOfCompArray = compNumbers.stream()
                .mapToInt(c -> c)
                .sum();

        total = sumOfUserArray + sumOfCompArray;
        return total;
    }
    public void printSumOfElements() {
        System.out.println("The total of user and comp numbers: " + total);
    }
     */
}
