package class_work;

public class Point {
    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point();

        point1.cardX = 5;
        point1.cordY = 10;

        point.cardX = 5;
        point.cordY = 10;

        System.out.println(point);

        boolean b = point.equals(point1);
        System.out.println(b);
    }

    private int cardX;

    private int cordY;

    @Override
    public String toString() {
        return "x: = " + cardX + " y: = " + cordY;
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point) obj;
        return this.cardX == point.cardX
                && this.cordY == point.cordY;
    }
}
