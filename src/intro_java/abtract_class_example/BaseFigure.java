package intro_java.abtract_class_example;

public abstract class BaseFigure {

    private int wight;

    private int height;

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract double getArea();

    public BaseFigure(int wight, int height){
        this.wight = wight;
        this.height = height;
    }

}
