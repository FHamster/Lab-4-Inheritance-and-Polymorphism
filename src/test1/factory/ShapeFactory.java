package test1.factory;


//具体工厂
public class ShapeFactory implements AbstractShapeFactory
{
    @Override
    public Circle creatCircle()
    {
        return new Circle();
    }

    @Override
    public Triangle creatTriangle()
    {
        return new Triangle();
    }

    @Override
    public Rectangle creatRectangle()
    {
        return new Rectangle();
    }
}
