package intro_java.karen_course.class_five;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(4);
        stack.add(9);
        stack.add(47);
        stack.add(87);
        stack.add(87);
        stack.add(87);
        stack.add(87);
        stack.add(87);
        stack.add(87);
        stack.add(87);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        stack.add(2);
        stack.add(2);
        System.out.println(stack.remove());
        stack.add(7);



    }
}
