package test1.factory;

//抽象工厂
interface AbstractShapeFactory
{
    String typeCircle = "Circle";
    String typeTriangle = "Triangle";
    String typeRectangle = "Rectangle";

    Circle creatCircle();

    Triangle creatTriangle();

    Rectangle creatRectangle();
}