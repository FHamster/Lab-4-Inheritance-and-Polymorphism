package test5;

import test1.shapes.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo
{
    public static void main(String[] args)
    {
        Class rectClass = new Rectangle(10, 18).getClass();
        //类名
        System.out.println("this class name is " + rectClass.getName());
        //超类名
        System.out.println("super class name is " + rectClass.getSuperclass().getName());
       //类方法
        Method[] methods = rectClass.getMethods();
        System.out.println("member methods are:");
        for (Method x : methods)
        {
            System.out.println(x.getName());
        }
        //类成员
        System.out.println("member fields are:");
        Field[] fields = rectClass.getDeclaredFields();
        for (Field x : fields)
        {
            System.out.println(x.getName());
        }
//        System.out.println();
    }
}
