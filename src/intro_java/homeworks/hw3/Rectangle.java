package intro_java.homeworks.hw3;

public class Rectangle {
    private double width;
    private double height;
    private String colour;

    public Rectangle() {}

    public Rectangle(double width, double height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimiter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + " height = " + height + " colour = " + colour;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        return this.width == rectangle.getWidth()
                && this.height == rectangle.getHeight()
                && this.colour.equals(rectangle.getColour());
    }

    // getters and setters
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
