package test2;

import test2.staff.*;

import java.util.Arrays;
import java.util.Date;

public class StaffDemo
{
    public static void main(String[] args)
    {
        Staff[] person = new Staff[4];
        person[0] = new Staff("staff1", "backstreet", 45, 1, 200,
                new Date(2005, 6, 30));

        person[1] = new Teacher("teacher1", "backstreet", 67, 1, 200,
                new Date(2005, 6, 30), "software", "Java", 300);

        person[2] = new SecurityGuard("SecurityGuard1", "backstreet", 25, 1, 200,
                new Date(2005, 6, 30), "kung fu", 300);

        person[3] = new Dean("Dean1", "backstreet", 5, 1, 200,
                new Date(2005, 6, 30), "software", "Java", 300, 400);
        printName(person);
        printSalary(person);

        sortBySalary(person);
        printSalary(person);

        sortByAge(person);
        printAge(person);

        sortByName(person);
        printName(person);

        sortByDateHired(person);
        printDateHired(person);

    }

    //    打印出每个人的年龄
    private static void printAge(Staff[] staffs)
    {
        for (Staff x : staffs)
        {
            System.out.printf("%s's age is %d\n", x.getName(), x.getAge());
        }
    }

    //    打印出每个人的名字
    private static void printName(Staff[] persons)
    {
        for (Staff x : persons)
        {
            System.out.println(x.getName());
        }
    }

    //    打印出Staff类或者其子类对象的薪水
    private static void printSalary(Staff[] staffs)
    {
        for (Staff x : staffs)
        {
            System.out.printf("%s's salary is %d\n", x.getName(), x.getSalary());
        }
    }

    //    打印出DateHired
    private static void printDateHired(Staff[] staffs)
    {
        for (Staff x : staffs)
        {
            System.out.printf("%s's DateHired is %s\n", x.getName(), x.getDateHired().toString());
        }
    }
    //    支持对Staff类及其子类按照各自的薪水降序排序；
    private static void sortBySalary(Staff[] staffs)
    {
        Arrays.sort(staffs, (Staff o1, Staff o2) -> (o1.getSalary() - o2.getSalary()));
    }

    //    对Staff对象按照年龄升序排序
    private static void sortByAge(Staff[] staffs)
    {
        Arrays.sort(staffs, (Staff o1, Staff o2) -> (o1.getAge() - o2.getAge()));
    }

    //    name升序进行排序
    private static void sortByName(Staff[] staffs)
    {
        Arrays.sort(staffs, (Staff o1, Staff o2) -> o1.getName().compareTo(o2.getName()));
    }
    //    DateHired升序进行排序
    private static void sortByDateHired(Staff[] staffs)
    {
        Arrays.sort(staffs, (Staff o1, Staff o2) -> o1.getDateHired().compareTo(o2.getDateHired()));

    }

}
