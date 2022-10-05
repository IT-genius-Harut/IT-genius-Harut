package intro_java.karen_course.class_six;

public class Rectangle extends Figure {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getArea() {
        return getLength() * getWidth();
    }


    @Override
    public int getPerimeter(){
        return 2 * (getWidth() + getLength());
    }

}
