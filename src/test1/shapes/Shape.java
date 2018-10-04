package test1.shapes;

//抽象基类shap作为另外三种图形的基类
//要求子类必须实现getPerimeter,getArea方法
public abstract class Shape
{
    //由于我们并不希望Shape的子类能够修改PI这个成员变量
    //所以使用final关键字，阻止子类对父类PI的修改
    final static double PI = Math.PI;

    abstract public double getPerimeter();

    abstract public double getArea();
}
