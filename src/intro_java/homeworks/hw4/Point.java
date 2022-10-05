package intro_java.homeworks.hw4;

public class Point {
    public final static Point origin = new Point(0, 0);
    //    not mandatory
//    public final static Point xUnit = new Point(1, 0);
//    public final static Point yUnit = new Point(0, 1);
    private final float xPos;
    private final float yPos;

    public Point(float xPos, float yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public float distance(Point otherPoint) {
        float a = xPos - otherPoint.xPos;
        float b = yPos - otherPoint.yPos;
        return (float) Math.sqrt(a * a + b * b);
    }

    public float distance() {
        return distance(origin);
    }
}
