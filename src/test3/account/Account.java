package test3.account;

import java.sql.Time;
import java.time.LocalDateTime;

public class Account
{
    private String AccName;
    private int balance;
    private double annualIntRate;
    private LocalDateTime accOpenDate;

    public Account()
    {
        AccName = "NoName";
        this.balance = 0;
        this.annualIntRate = 0;
        this.accOpenDate = LocalDateTime.now();
    }

    public Account(String accName, int balance, double annualIntRate, LocalDateTime accOpenDate)
    {
        AccName = accName;
        this.balance = balance;
        this.annualIntRate = annualIntRate;
        this.accOpenDate = accOpenDate;
    }

    public String getAccName()
    {
        return AccName;
    }

    public void setAccName(String accName)
    {
        AccName = accName;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public double getAnnualIntRate()
    {
        return annualIntRate;
    }

    public void setAnnualIntRate(double annualIntRate)
    {
        this.annualIntRate = annualIntRate;
    }

    public LocalDateTime getAccOpenDate()
    {
        return accOpenDate;
    }

    public void setAccOpenDate(LocalDateTime accOpenDate)
    {
        this.accOpenDate = accOpenDate;
    }

    //    取款(withdraw)
    public void withdraw(int money)
    {
        //检查存入取款为大于0
        if (money < 0)
        {
            System.out.println("money < 0");
            return;
        }

        //检查余额充足
        if (balance - money < 0)
        {
            System.out.println("run out of balance");
        } else
        {
            balance -= money;
            System.out.printf("withdraw %d complete,balance now is %d\n", money, balance);
        }
    }

    //    存款(deposit)和
    public void deposit(int money)
    {

        if (money < 0)
        {
            System.out.println("money < 0");
        } else
        {
            balance += money;
            System.out.printf("deposit %d complete,balance now is %d\n", money, balance);
        }
    }
}
