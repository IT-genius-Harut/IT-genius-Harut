package intro_java.class_13_excepions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the original array");
        String inputArray = scanner.nextLine();
        String[] inputsAsStrings = inputArray.split(" ");
        int validInputs = 0;
        int currentIndex = 0;



        // 5 8 a 26 7

        for (String input : inputsAsStrings) {
            try {
                Integer.parseInt(input);
                validInputs++;
            } catch (NumberFormatException e) {
                System.out.println("Value: " + input + " cannot be converted to int");
            }
        }

        int[] ints = new int[validInputs];
        for (int i = 0; i < inputsAsStrings.length; i++) {
            try {
                int inputInt = Integer.parseInt(inputsAsStrings[i]);
                ints[currentIndex] = inputInt;
                currentIndex++;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.println("Please enter the number you wish to find");
            String input = scanner.next();
            if (input.equals("exit")) break;
            // 3 15 7 9 5 4
            try {
                // "5" -> 5
                int intToFind = Integer.parseInt(input);
                int index = getIndexByValue(ints, intToFind);
                System.out.println("Index for value: " + intToFind
                        + " is: " + index);
            } catch (ArrayValueNotFoundException e) {
                e.log();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Please input a valid string");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int getIndexByValue(int[] arr, int value)
            throws ArrayValueNotFoundException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        throw new ArrayValueNotFoundException("value: [" + value
                + "] was not found in the provided array");
    }
}
