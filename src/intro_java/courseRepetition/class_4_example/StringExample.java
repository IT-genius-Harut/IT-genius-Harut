package intro_java.courseRepetition.class_4_example;

public class StringExample {
    public static void main(String[] args) {
        int[] ints = {15, 28, 2, 86, 96, 52, 47, 69, 3};
        char[] chars = {'k', 's', '9', '@', '_', '%'};
        boolean[] booleans = {true, true, false, true};
        System.out.println("Print ints array ");
        Utils.printIntsArray(ints);
        System.out.println();
        System.out.println("Print chars array ");
        Utils.printCharsArray(chars);
        System.out.println();
        System.out.println("Print booleans array ");
        Utils.printBooleansArray(booleans);
        System.out.println();
        System.out.println("Print ints and chars arrays ");
        Utils.printIntsAndCharsArray(ints, chars);


        String a = "Hello World";
        System.out.println(a);
        String replaced = a.replace('l', '@');
        System.out.println(replaced);
        String b = "Barev ashxarh";
        System.out.println(b);
        String replace2 = b.replace('a', 'w')
                .replace('b', 'p')
                .replace('e', 'z')
                .replace('r', 'z')
                .replace('v', 'x')
                .replace('s', 'n')
                .replace('h', 'f');
        System.out.println(replace2);
        String substring = a.substring(4);
        String substring2 = a.substring(2, 7);
        System.out.println(substring);
        System.out.println(substring2);
        String[] split = a.split("e");
        Utils.printStringArray(split);
        String lower = a.toLowerCase();
        String upper = a.toUpperCase();
        System.out.println("lower case");
        System.out.println(lower);
        System.out.println("Upper case");
        System.out.println(upper);
        int day = 5;
        int fiveDay = Utils.datToSecond(day);
        System.out.println(day + " second in minute " + fiveDay);
    }
}
