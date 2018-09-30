package test1.shapes;

//抽象基类shap作为另外三种图形的基类
//要求子类必须实现getPerimeter,getArea方法
public abstract class Shape
{
    final static double PI = Math.PI;

    abstract public double getPerimeter();

    abstract public double getArea();
}
