package intro_java.class_3_arrays;

public class Arrays {
    public static void main(String[] args) {
        // an array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // accessing the first element
        System.out.println("First element of array: " + intArray[0]); // the enumeration starts at 0
        // accessing the last element
        System.out.println("Last element of array: " + intArray[intArray.length - 1]);

        System.out.println("An array of booleans: ");
        // an array of booleans
        boolean[] boolArray = {true, false, true, true};
        // enhanced for loop
        for (boolean b : boolArray) {
            System.out.println(b);
        }

        System.out.println("Printing char array with initializer");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        System.out.println("Printing char array with default values");
        char[] charArray2 = new char[5];
        for (char c : charArray2) {
            System.out.print(c);
        }
        System.out.println();

        System.out.println("Printing int array with default values");
        // creating an array with a specific size
        int[] intArray2 = new int[5];
        // all elements are initialized to 0
        System.out.println("First element: " + intArray2[0]);
        System.out.println("Second element: " + intArray2[1]);
        System.out.println("Third element: " + intArray2[2]);
        System.out.println("Fourth element: " + intArray2[3]);
        System.out.println("Fifth element: " + intArray2[4]);

        System.out.println("Initializing the array: ");
        // writing to an array
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println("First element: " + intArray2[0]);
        System.out.println("Second element: " + intArray2[1]);
        System.out.println("Third element: " + intArray2[2]);
        System.out.println("Fourth element: " + intArray2[3]);
        System.out.println("Fifth element: " + intArray2[4]);

        // creating a large array of booleans
        boolean[] boolArray2 = new boolean[100];
        // all elements are initialized to false
        for (int i = 0; i < boolArray2.length; i++) {
            // setting each 11th element to true
            boolArray2[i] = i % 11 == 0;
        }

        // printing the array
        System.out.println("Printing the array: ");
        for (int i = 0; i < boolArray2.length; i++) {
            System.out.print(boolArray2[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
