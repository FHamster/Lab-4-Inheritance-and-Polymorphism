package test1.factory;

public class Triangle implements Shape
{
    private double a;
    private double b;
    private double c;

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

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
    }

    Triangle(double a, double b, double c)
    {
//        System.out.printf("初始化Triangle %f %f %f\n", a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Triangle()
    {
//        System.out.printf("初始化Triangle %f %f %f\n", a, b, c);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }

    @Override
    public double getArea()
    {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
