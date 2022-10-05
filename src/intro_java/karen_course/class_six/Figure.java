package intro_java.karen_course.class_six;

public abstract class Figure {

    private int length;

    private int width;

    public Figure(int length, int width){
        this.length = length;
        this.width = width;
    }

    public abstract int getArea();

    public abstract int getPerimeter();
    @Override
    public String toString(){
        return "the figure length is: " + length + " width is: " + width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
