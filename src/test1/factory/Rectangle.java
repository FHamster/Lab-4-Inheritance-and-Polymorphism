package test1.factory;

public class Rectangle implements Shape
{
    private double a;//a边
    private double b;//b边


    Rectangle(double a, double b)
    {
//        System.out.printf("初始化Rectangle %f %f\n", a, b);
        this.a = a;
        this.b = b;
    }

    Rectangle()
    {
//        System.out.printf("初始化Rectangle %f %f\n", a, b);
        this.a = 0;
        this.b = 0;
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    @Override
    public double getPerimeter()
    {
        return (a + b) * 2;
    }

    @Override
    public double getArea()
    {
        return a * b;
    }

}
