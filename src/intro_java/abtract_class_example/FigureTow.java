package intro_java.abtract_class_example;

public class FigureTow extends BaseFigure {
    @Override
    public double getArea() {
        return 0;
    }

    FigureTow(int weight, int height){
        super(weight, height);
    }
}
