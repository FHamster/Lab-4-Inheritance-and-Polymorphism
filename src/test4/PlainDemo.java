package test4;

public class PlainDemo
{
    public static void main(String[] args)
    {
        PlainRect plainRect = new PlainRect(10, 10, 0, 0);
        System.out.println(plainRect.isInside(1, -1));
    }
}
