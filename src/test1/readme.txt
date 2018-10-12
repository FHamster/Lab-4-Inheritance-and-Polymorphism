1. 抽象类Shape与泛型数组列表

(1)编写一抽象类(Shape)，有一个PI属性(final static)用于存放圆周率、用于求周长的抽象方法public double getPerimeter();和用于求面积的抽象方法public double getArea();。

(2)长方形类、三角形类与圆形类均为其子类，并各有各的属性，并均有获得其周长、面积的方法。还需要生成相应的setter/getter方法。

(3)在一测试类中，分别建立若干个子对象（对象类型自定，尽量用到所定义的类），并放入数组或者ArrayList中，然后将各种形状的对象的所有面积与长度累加输出。

(4)针对上面的各子类编写相应的equals,hashCode,toString(可自动生成，但需看懂代码，注意里面对double类型属性是如何进行比较的)。

注意：所有的代码都应该放在合适的包中（包名自定）。

思考：为什么PI属性要使用final进行修饰？
/*********************************************************************************************************************/
test1完成于2018/9/30
由于在实验3中已经使用了继承方式实现Circle，Rectangle，Triangle
所以并没有花费很多时间，直接ctrlCV然后少许按照题目要求修改了代码。

抽象类Shape为三种图形的共有超类
    Shpae中含有静态变量PI和抽象方法getPerimeter，getArea
    这意味着Shape的子类必须实现所有抽象方法
    关于final
        在这里对PI用final修饰的原因是作者不希望Shape类的的使用者更改这个数字

三种图形类为Shape的子类
    添加了对应的成员变量
    添加了带参数的构造器
    添加了getter/setter
    均实现了所有抽象方法
    覆盖了hashCode，toString，equals方法（通过IDEA自动生成的）

关于double类型的比较
    观察用idea重构equals的模板
    发现对double的比较使用Double.compare方法
    跳转到Double.compare方法的源代码
        public static int compare(double d1, double d2) {
                if (d1 < d2)
                    return -1;           // Neither val is NaN, thisVal is smaller
                if (d1 > d2)
                    return 1;            // Neither val is NaN, thisVal is larger

                // Cannot use doubleToRawLongBits because of possibility of NaNs.
                long thisBits    = Double.doubleToLongBits(d1);
                long anotherBits = Double.doubleToLongBits(d2);

                return (thisBits == anotherBits ?  0 : // Values are equal
                        (thisBits < anotherBits ? -1 : // (-0.0, 0.0) or (!NaN, NaN)
                         1));                          // (0.0, -0.0) or (NaN, !NaN)
            }
    就是两个double的d1 d2先简单地用<和>判断
    然后Double.doubleToLongBits转换为Long类型再进行比较
    推测Long形式更好比较大小
    我在DoubleDemo.java中将这个值输出看了看我也不知道这个值意味着什么

Array和Arraylist
    在写测试方法ShapeDemo使用的是数组
    理由是作为一个测试类我只想分别初始化三种图形对象，对Arraylist的变长特性没什么需求
    所以使用了Array

关于向上转型
    在测试代码中有这样一段
        for (Shape x : shapes)
        {
            System.out.println("Area = " + x.getArea());
            sumArea += x.getArea();
            System.out.println("Per = " + x.getPerimeter());
            sumPer += x.getPerimeter();
        }
    Shape类型的x指针能够指向三种图形实例
    这是由于三种图形实例的公共超类就是Shape所以能进行向上转型

