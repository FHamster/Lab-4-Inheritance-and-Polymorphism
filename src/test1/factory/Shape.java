package test1.factory;

//抽象基类shap作为另外三种图形的基类
//要求子类必须实现getPerimeter,getArea方法
interface Shape
{
    double PI = Math.PI;

    double getPerimeter();

    double getArea();
}
