package intro_java.courseRepetition.globall_updata;

import java.util.*;

public class dataStructursExample {
    public static void main(String[] args) {

       int[] arr = new int[10];

        arr[2] = 4;
        arr[3] = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);


        List<Integer> integers = new ArrayList<>();

        integers.add(7);
        integers.add(2);
        integers.add(3);
        integers.add(9);
        integers.add(69);
        integers.add(7);
        integers.add(27);
        integers.add(27);
        integers.add(5);
        integers.add(5);

        System.out.println(integers.size());
        System.out.println(integers);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("35");
        arrayList.add("27");
        arrayList.add("poxos");
        arrayList.add("poxosyan");

        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < integers.size(); i++) {
            int el = integers.get(i);
            integerSet.add(el);
        }
        System.out.println(integerSet);

        Map<String, String> map = new HashMap<>();

        map.put("us", "united states");
        map.put("am", "armenia");
        map.put("ru", "russia");
        map.putIfAbsent("br", "brazil");

        String value = map.getOrDefault("us",
                "could not find this country");
        System.out.println(value);
        for (String key : map.keySet()) {
            String mapValue = map.get(key);
            System.out.println(key + " : " + mapValue);
        }

        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(8);
        integerList.add(-7);
        integerList.add(4);
        integerList.add(17);
        integerList.add(-7);
        integerList.add(69);
        integerList.add(69);
        integerList.add(6);
        integerList.add(6);


        System.out.println(integerList);

        Set<Integer> integerSet1 = new HashSet<>();
        System.out.print("[");
        for (int i = integerList.size() - 1; i >= 0; i--){
            int el = integerList.get(i);
            if (!integerSet1.add(el)){
                System.out.print(el + " ");
                integerList.remove(i);
            }
        }
        System.out.println("]");
        System.out.println(integerList);

     /*   ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        integers.add(9);

        System.out.println("integers length = " + integers.size());
        System.out.println("integers element = " + integers);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(8);
        integerList.add(2);
        integerList.add(71);
        integerList.add(39);
        integerList.add(70);
        integerList.add(70);

        System.out.println("integerList length = " + integerList.size());
        System.out.println("integerList element = " + integerList);

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(7);
        integerSet.add(5);
        integerSet.add(8);
        integerSet.add(38);
        integerSet.add(2);
        integerSet.add(2);

        System.out.println("integerSet length = " + integerSet.size());
        System.out.println("integerSet element = " + integerSet);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "ab");
        map.put(3, "abc");
        map.put(4, "abcd");
        map.put(5, "abcde");
        map.put(6, "abcdef");
        map.put(6, "abcdef");

String value = map.getOrDefault(1, "could not find this");

        System.out.println("map length = " + map.size());
        for (int key : map.keySet()) {
            String mapValue = map.get(key);
            System.out.println(key + " : " + mapValue);
        }*/


        System.out.println("random number = " + randomNumber());
    }

    public static int randomNumber() {
        return (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
    }
}
