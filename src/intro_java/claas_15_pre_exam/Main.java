package intro_java.claas_15_pre_exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number");
            String userInput = scanner.next();
            if (userInput.equals("exit")) break;
//            "5" -> 5;
            int userInputInt = Integer.parseInt(userInput);
//            if (userInputInt > 5) {
//                System.out.println("Your input is more than 5");
//            } else {
//                System.out.println("You entered a number less than or equal to 5");
//            }
//            String outputMessage = userInputInt > 5 // condition
//                    ? "Your input is more than 5" // if condition is true
//                    : "You entered a number less than or equal to 5"; // otherwise
//            System.out.println(outputMessage);
            String outputMessage = "Your number corresponds to: "
//                 condition   ?   true case : false case
                    + (userInputInt > 5 ? "Green" : "Yellow") + " colour";
            System.out.println(outputMessage);
        }


/*        Stack<String> stringStack = new Stack<>();
        stringStack.push("first item");
        stringStack.push("second item");
        stringStack.push("third item");

        String stackPeekValue = stringStack.pop();
        System.out.println("Last value for stack: " + stackPeekValue);
        System.out.println("After pop: " + stringStack.peek());
        *//*stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        System.out.println(stringStack.size());*//*

        float pi = 3.1415f;
        int piInt = (int) pi; // 3

        // {([]{})}

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("First Element");
        stringQueue.add("Second Element");
        stringQueue.add("Third Element");
        String queuePeekValue = stringQueue.peek();
        System.out.println("Last value for queue: " + queuePeekValue);
        stringQueue.poll();
        stringQueue.poll();
        stringQueue.poll();
        stringQueue.remove();*/
    }
}
