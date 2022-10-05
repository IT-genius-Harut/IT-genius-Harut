package intro_java.home_work_example;

public class Rectangle {
    // todo: create Main class and use this class 18/09/2022
    private int width;

    private int height;

    private String colour;

    public Rectangle(){

    }

    public Rectangle(int width, int height, String colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public int getArea(int width, int height){
        return width * height;
    }
    public int getPerimiter(int width, int height){
        return 2 * (width + height);
    }
    @Override
    public String toString(){
        return "The box width is: " + width + " height is: " + height
                 + " and colour is: " + colour;
    }
    @Override
    public boolean equals(Object otherRectangle){
        Rectangle rectangle = (Rectangle) otherRectangle;
        return (this.width == rectangle.width) &&
                (this.height == rectangle.height);
    }

      // GETTERS AND SETTERS

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

}
