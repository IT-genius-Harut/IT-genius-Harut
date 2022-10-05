package intro_java.karen_course.class_six;

public class Triangle extends Figure{

    public Triangle(int length, int width){
        super(length, width);
    }

    @Override
    public int getArea(){
        return  2 / (getArea() * getLength());
    }

    public int getPerimeter(){
        double tmp = 0;
        double a = (getWidth() * getWidth()) + (getLength() + getLength());
        tmp = Math.sqrt(a);
        return (int) (getWidth() + getLength() + tmp);
    }


}
