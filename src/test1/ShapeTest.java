package test1;

import test1.shapes.Circle;
import test1.shapes.Rectangle;
import test1.shapes.Shape;
import test1.shapes.Triangle;

public class ShapeTest
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(1, 1, 1);
        Rectangle rectangle = new Rectangle(1, 1);

        //由于shape为基类，所以可以进行向上转型
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = triangle;
        shapes[2] = rectangle;


        double sumArea = 0;
        double sumPer = 0;
        for (Shape x : shapes)
        {
            System.out.println("Area = " + x.getArea());
            sumArea += x.getArea();
            System.out.println("Per = " + x.getPerimeter());
            sumPer += x.getPerimeter();
        }

        System.out.println("sumArea = " + sumArea);
        System.out.println("sumPer = " + sumPer);

    }
}

