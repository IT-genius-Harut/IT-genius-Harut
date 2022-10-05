package intro_java.homeworks.hw2;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // armstrong numbers
        for (int i = 1; i <= 1000000; i++) {
            if (i == calculateArmstrongNumber(i)) {
                System.out.println("Armstrong number found: " + i);
            }
        }
    }

    public static int calculateArmstrongNumber(int number) {
        int returnValue = 0; // the return value
        // any digit number case
        // calculating the number of digits: 1584 -> 4, 14 -> 2
        int numberOfDigits = 0;
        int numberCopy = number; // copying the number to a new variable to use it later
        while (numberCopy != 0) {
            numberOfDigits++; // increase the number of digits each iteration
            numberCopy /= 10;
        }

        while (number != 0) {
            returnValue += Math.pow(number % 10, numberOfDigits); // calculate the power of the digit
            number = number / 10;
        }
        return returnValue;
    }
}
