package test4;

public class PlainRect extends Rect
{
    private int startX;
    private int startY;

    public PlainRect()
    {
        this(0, 0, 0, 0);
    }

    public PlainRect(int width, int height, int startX, int startY)
    {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }
    public boolean isInside(double x, double y)
    {
        if ((startX < x && x < startX + width))
            if (startY > y && y > startX - height)
                return true;
        return false;
    }
}
