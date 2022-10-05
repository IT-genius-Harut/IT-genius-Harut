package intro_java.class_12_data_structurs;

public class Main {
    public static void main(String[] args) {
        /*Node head = new Node(5);
        CustomLinkedList linkedList = new CustomLinkedList(head);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(15);

        linkedList.traverse();*/

        /*// array
        int[] arr = new int[10];

        // inserting
        arr[3] = 8;
        arr[2] = -5;

        List<Integer> integerArrayList = new LinkedList<>();

        integerArrayList.add(8); // 0
        integerArrayList.add(1); // 1
        integerArrayList.add(2); // 2
        integerArrayList.add(6); // 3
        integerArrayList.add(-9); // 4
        integerArrayList.add(-9); // 5

//        System.out.println(arr.length);
//        System.out.println(integerArrayList.size());

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < integerArrayList.size(); i++) {
            int el = integerArrayList.get(i); // arr[i]
            integerSet.add(el);
        }*/

       /* Map<String, String> map = new HashMap<>();
        //      key | value
        map.put("us", "united states");
        map.put("am", "armenia");
        map.put("br", "brazil");
        map.putIfAbsent("qw", "qwerty");

        String value = map.getOrDefault("us",
                "could not find this country");
        System.out.println(value);

        for (String key : map.keySet()) {
            String mapValue = map.get(key);
            System.out.println(key + " : " + mapValue);
        }*/
/*
        List<Integer> integerArrayList = new LinkedList<>();

        integerArrayList.add(8); // 0
        integerArrayList.add(1); // 1
        integerArrayList.add(2); // 2
        integerArrayList.add(6); // 3
        integerArrayList.add(6); // 3
/       integerArrayList.add(5); // 3
        integerArrayList.add(-9); // 4
        integerArrayList.add(-9); // 5

        System.out.println(integerArrayList);

        Set<Integer> integerSet = new HashSet<>();

//        System.out.print("[");
        for (int i = integerArrayList.size() - 1; i >= 0; i--) {
            int el = integerArrayList.get(i);
            if (!integerSet.add(el)) {
//                System.out.print(el + " ");
                integerArrayList.remove(i);
            }
        }
//        System.out.println("]");
        System.out.println(integerArrayList);*/
    }
}

