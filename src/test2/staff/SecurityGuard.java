package test2.staff;

import java.util.Date;

public class SecurityGuard extends Staff
{
    private String skills;
    private int dangerousAllowance;

    public SecurityGuard(String name, String address, int age, int sex, int salary, Date dateHired, String skills, int dangerousAllowance)
    {
        super(name, address, age, sex, salary, dateHired);
        this.skills = skills;
        this.dangerousAllowance = dangerousAllowance;
    }

    @Override
    public int getSalary()
    {
        return super.getSalary() + dangerousAllowance;
    }

    public String getSkills()
    {
        return skills;
    }

    public void setSkills(String skills)
    {
        this.skills = skills;
    }

    public int getDangerousAllowance()
    {
        return dangerousAllowance;
    }

    public void setDangerousAllowance(int dangerousAllowance)
    {
        this.dangerousAllowance = dangerousAllowance;
    }
}
