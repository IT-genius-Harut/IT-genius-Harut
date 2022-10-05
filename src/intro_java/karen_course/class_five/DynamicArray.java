package intro_java.karen_course.class_five;

public class DynamicArray {

    private int[] array = new int[10];

    private int size;

    public void extendArray(){
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void add(int value) {
        if (size == array.length){
            extendArray();
        }
        array[size++] = value;
    }

    public int getByIndex(int index){
        return array[index];
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
