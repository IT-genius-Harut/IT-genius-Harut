package intro_java.karen_course.class_five;

public class Stack {

    private int[] array = new int[10];

    private int index;

    public Stack() {
        index = -1;
    }


    public void add(int element) {
        if (index == 9) {
            System.out.println("The stack is full");
        } else {
            array[++index] = element;
        }
    }

    public int remove() {
        if (index == -1) {
            System.out.println("The stack is empty");
            return 0;
        }
        return array[index--];
    }
}
