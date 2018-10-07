package test4;

public class Rect
{
    protected int height;
    protected int width;

    public Rect()
    {
        this(10, 10);
    }

    public Rect(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter()
    {
        return (width + height) * 2;
    }

    public double getArea()
    {
        return width * height;
    }

}


