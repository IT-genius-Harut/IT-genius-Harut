package intro_java.class_5_recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        solve(3, "A", "B", "C");
    }

    /**
     * Recursive method to solve the Tower of Hanoi problem
     *
     * @param n      number of disks
     * @param start  the name of the start pole
     * @param offset the name of the offset pole
     * @param end    the name of the end pole
     */
    public static void solve(int n, String start, String offset, String end) {
        if (n == 1) {
            // move the disk from start to end
            System.out.println(start + " -> " + end);
        } else {
            // move the n-1 disks from start to offset
            solve(n - 1, start, end, offset);
            // move the nth disk from start to end
            System.out.println(start + " -> " + end);
            // move the n-1 disks from offset to end
            solve(n - 1, offset, start, end);
        }
    }
}
