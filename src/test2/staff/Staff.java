package test2.staff;

import java.util.Date;

public class Staff
{
    //成员变量
    private String name;
    private String address;
    private int age;
    private int sex;
    private int salary;
    private Date dateHired;

    public Staff(String name, String address, int age, int sex, int salary, Date dateHired)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    //成员方法
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public Date getDateHired()
    {
        return dateHired;
    }

    public void setDateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }
}
