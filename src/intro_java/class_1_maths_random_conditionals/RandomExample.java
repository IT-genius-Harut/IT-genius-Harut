package intro_java.class_1_maths_random_conditionals;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        long seed = 123456789;
        Random randomNumberGenerator = new Random(seed);
        int randomNumber = randomNumberGenerator.nextInt(100);
        System.out.println("Random number: " + randomNumber);
        double randomDouble = randomNumberGenerator.nextDouble();
        System.out.println("Random double: " + randomDouble);
        boolean randomBoolean = randomNumberGenerator.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
        char randomChar = (char) (randomNumberGenerator.nextInt(26) + 'a');
        System.out.println("Random char: " + randomChar);
    }
}