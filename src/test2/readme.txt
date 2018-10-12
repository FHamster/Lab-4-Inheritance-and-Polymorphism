2. Staff, Teacher, SecurityGuard, Dean

(1)定义Staff类(职工)，添加如下属性(name, address, age, sex, salary, dateHired)，类型自定，其中salary为工资，dateHired为雇佣日期(java.util.Date类型)。生成相应的setter/getter方法。

(2)编写Teacher类(教师)，继承自Staff类，包含属性：department(系), speciality(专业), postAllowance(岗位津贴)。

(3)编写SecurityGuard类(保安)，继承自Staff类，包含属性：skills(专技), dangerousAllowance(高危津贴)。

(4)编写Teacher的一个子类Dean(院长)，包含属性：adminAward(行政奖金)。

(5)定义上述各类的getter/setter方法，并添加合适的构造方法。

(6)编写一个测试类，在测试类中添加若干个Staff, Teacher, SecurityGuard, Dean实例(个数及内容自定)，
并在测试类中定义并测试如下方法：
①编写一个方法private static void printName(Staff[] persons)打印出每个人的名字；
②编写一个方法private static void printSalary(Staff[] staffs)打印出Staff类或者其子类对象的薪水
    (注意：Staff的薪水只有salary，
    Teacher的薪水为salary+postAllowance，
    SecurityGuard的薪水为salary+dangerousAllowance，
    而Dean的薪水则为salary+postAllowance+adminAward)；
③编写一方法private static void sortBySalary(Staff[] staffs)，支持对Staff类及其子类按照各自的薪水降序排序；
④编写一方法private static void sortByAge(Staff[] staffs)，对Staff对象按照年龄升序排序，再编写一个方法按name升序进行排序；
⑤(选做)编写一方法sortByDateHired，支持对Staff类及其子类按照各自的dateHired升序排序，可以使用java.util.Date类的getTime方法。

/*********************************************************************************************************************/
test2完成于2018/9/30
继承关系如下
    Staff
        Teacher
            Dean
        SecurityGuard

关于对getSalary的override
    override是多态的一种体现
    由于  Staff，Teacher，Dean，SecurityGuard计算Salary的方式不同
    所以根据不同Salary的计算方法分别override 他们的getSalary方法

关于排序
    由于要根据不同排序关键字排序，所以通过实现compareTo方法再用Array.sort的方法不适用了
    于是在排序函数中分别用lambda表达式传入了不同的Comparable外部比较器，如下
        按照年龄排序
        Arrays.sort(staffs, (Staff o1, Staff o2) -> (o1.getAge() - o2.getAge()));
        按照姓名排序
        Arrays.sort(staffs, (Staff o1, Staff o2) -> o1.getName().compareTo(o2.getName()));
        按照入职日期排序
        Arrays.sort(staffs, (Staff o1, Staff o2) -> o1.getDateHired().compareTo(o2.getDateHired()));

