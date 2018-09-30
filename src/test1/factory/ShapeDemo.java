package test1.factory;

public class ShapeDemo
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        Shape shape3 = shapeFactory.getShape("CIRCLE");
        Shape shape4 = shapeFactory.getShape("CIRCLE");
        Shape shape5 = shapeFactory.getShape("CIRCLE");



        Shape[] shapes = new Shape[6];
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = triangle1;
        shapes[3] = triangle2;
        shapes[4] = rectangle1;
        shapes[5] = rectangle2;

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

