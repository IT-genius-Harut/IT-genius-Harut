package intro_java.karen_course.class_three;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 8, 7, 9, 48, 98, 28};
        // for example
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        String a = "Hello world";
        // or
        String a2 = new String("Hello world");
        System.out.println("chars array");
        char[] arr = {'d', 's', '$', '_', '-', '(', 'W', '*'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[][] matrix = new int[3][3];

        for (int[] el : matrix) {
            for (int i = 0; i < el.length; i++) {
                System.out.print(el[i] + 7 + " ");
            }
            System.out.println();
        }

        int[] arrEx = {1, 5, 3, 7, 17, 9, -7, 21, -79, 2, 32, 57, 69, 45};

        for (int i = 0; i < arrEx.length; i++) {
            System.out.print(arrEx[i] + " ");
        }
        System.out.println();
        int max = arrEx[0];
        for (int i = 0; i < arrEx.length; i++) {
            if (arrEx[i] > max) {
                max = arrEx[i];
            }
        }
        System.out.println("max = " + max);


        int min = arrEx[0];
        for (int i = 0; i < arrEx.length; i++) {
            if (min > arrEx[i]) {
                min = arrEx[i];
            }
        }
        System.out.println("min = " + min);
        System.out.print("even element = ");
        for (int i = 0; i < arrEx.length; i++) {
            if (arrEx[i] % 2 == 0) {
                System.out.print(arrEx[i] + " ");
            }
        }
        System.out.println();
        System.out.print("odd element = ");
        for (int i = 0; i < arrEx.length; i++) {
            if (arrEx[i] % 2 != 0) {
                System.out.print(arrEx[i] + " ");
            }
        }
        System.out.println();
        System.out.print("even element currentIndex = ");
        int evenSum = 0;
        for (int i = 0; i < arrEx.length; i++) {
            if (arrEx[i] % 2 == 0) {
                evenSum++;
            }
        }
        System.out.println(evenSum);

        System.out.print("odd element currentIndex = ");
        int oddSum = 0;
        for (int i = 0; i < arrEx.length; i++) {
            if (arrEx[i] % 2 != 0) {
                oddSum++;
            }
        }
        System.out.println(oddSum);

        System.out.print("array element sum = ");
        int sum = 0;
        for (int i = 0; i < arrEx.length; i++) {
            sum += arrEx[i];
        }
        System.out.println(sum);

        System.out.print("array element average sum = ");
        int averageSum = 0;
        for (int i = 0; i < arrEx.length; i++) {
            averageSum += arrEx[i];
        }
        System.out.println(averageSum / arrEx.length);

        int[] array2 = {1, 44, 36, 98, 28, 17, 28, 37, 62, 84};

        int x = 44;
        boolean b = false;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == x) {
                b = true;
                break;
            }
        }
        System.out.println(b);

        int index = -1;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == x) {
                index = i;
            }
        }
        System.out.println(index);

        int index1 = 3;
        if (index1 >= 0 && index1 < array2.length) {
            System.out.println(array2[index1]);
        } else {
            System.out.println("Pleas input another index");
        }
        int tmp = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] < array2[j]) {
                    tmp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        int tmp2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] > array2[j]){
                    tmp2 = array2[i];
                    array2[i] = array2[j];
                    array2[j] = tmp2;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}


