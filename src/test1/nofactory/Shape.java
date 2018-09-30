package test1.nofactory;

//抽象基类shap作为另外三种图形的基类
//要求子类必须实现getPerimeter,getArea方法
abstract class Shape
{
    final static double PI = Math.PI;

    abstract public double getPerimeter();

    abstract public double getArea();

}
