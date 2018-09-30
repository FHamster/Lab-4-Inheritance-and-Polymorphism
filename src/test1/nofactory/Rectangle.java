package test1.nofactory;

class Rectangle extends Shape
{
    private double a;//a边
    private double b;//b边

    Rectangle(double a, double b)
    {
        System.out.printf("初始化Rectangle %f %f\n", a, b);
        this.a = a;
        this.b = b;
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
