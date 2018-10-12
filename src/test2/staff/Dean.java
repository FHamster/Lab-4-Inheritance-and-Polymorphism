package test2.staff;

import java.util.Date;

public class Dean extends Teacher
{
    private int adminAward;

    public Dean(String name, String address, int age, int sex, int salary, Date dateHired, String department, String speciality, int postAllowance, int adminAward)
    {
        super(name, address, age, sex, salary, dateHired, department, speciality, postAllowance);
        this.adminAward = adminAward;
    }

    @Override
    public int getSalary()
    {
        return super.getSalary() + adminAward;
    }

    public int getAdminAward()
    {
        return adminAward;
    }

    public void setAdminAward(int adminAward)
    {
        this.adminAward = adminAward;
    }
}
