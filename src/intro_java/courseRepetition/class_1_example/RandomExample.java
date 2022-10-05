package intro_java.courseRepetition.class_1_example;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        long seed = 123456789;
        Random randomNumberGenerator = new Random(seed);
        int randomInt = randomNumberGenerator.nextInt(100);
        System.out.println("random number = " + randomInt);
        double randomDouble = randomNumberGenerator.nextDouble();
        System.out.println("random double = " + randomDouble);
        boolean randomBoolean = randomNumberGenerator.nextBoolean();
        System.out.println("random boolean = " + randomBoolean);
        char randomChar = (char) (randomNumberGenerator.nextInt(26) + 'a');
        System.out.println("random char = " + randomChar);
    }
}
