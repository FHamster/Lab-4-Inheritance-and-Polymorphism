package test1.shapes;

import java.util.Objects;

public class Rectangle extends Shape
{
    private double a;//a边
    private double b;//b边

    public Rectangle(double a, double b)
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
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 &&
                Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(a, b);
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
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
