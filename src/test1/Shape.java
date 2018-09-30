package test1;

//抽象基类shap作为另外三种图形的基类
//要求子类必须实现countArea，countPerimeter方法
abstract class Shape
{
    private double Perimeter;
    private double Area;

    public void setPerimeter(double perimeter)
    {
        Perimeter = perimeter;
    }

    public void setArea(double area)
    {
        Area = area;
    }

    public double getPerimeter()
    {
        return Perimeter;
    }

    public double getArea()
    {
        return Area;
    }

    @Override
    public String toString()
    {
        return "Shape{" +
                "Perimeter=" + Perimeter +
                ", Area=" + Area +
                '}';
    }

    abstract public void countArea();

    abstract public void countPerimeter();
}
