package intro_java.abtract_class_example;

public class FigureOne extends BaseFigure{
    public FigureOne(int wight, int  height){
        super(wight, height);
    }
    FigureOne figureOne = new FigureOne(71, 30);

    @Override
    public double getArea(){
        return figureOne.getWight() * figureOne.getHeight();
    }
}
