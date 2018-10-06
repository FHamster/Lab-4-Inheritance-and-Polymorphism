package test3.account;

import java.time.LocalDateTime;

public class CheckingAccount extends Account
{

    private int overLimit;
    private int overDraft;

    public CheckingAccount(int overLimit, int overDraft)
    {
    }

    public CheckingAccount(String accName, int balance, double annualIntRate, LocalDateTime accOpenDate, int overLimit, int overDraft)
    {
        super(accName, balance, annualIntRate, accOpenDate);
        this.overLimit = overLimit;
        this.overDraft = overDraft;
    }

    public int getOverLimit()
    {
        return overLimit;
    }

    public void setOverLimit(int overLimit)
    {
        this.overLimit = overLimit;
    }

    public int getOverDraft()
    {
        return overDraft;
    }

    public void setOverDraft(int overDraft)
    {
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(int money)
    {
//        检查存入取款为大于0
        if (money < 0)
        {
            System.out.println("money < 0");
            return;
        }

        if (super.getBalance() - money < 0)//检查余额充足
        {
            System.out.println("run out of balance into overDraft");
            if (overDraft + money > overLimit + super.getBalance())//检查透支余额充足
            {
                System.out.println("run out of overDraft");
            } else
            {
                super.setBalance(0);
                overDraft += (money - super.getBalance());
                System.out.printf("withdraw %d complete,balance now is %d,overDraft now is %d\n", money, super.getBalance(), overDraft);
            }
        } else
        {
            super.setBalance(super.getBalance() - money);
            System.out.printf("withdraw %d complete,balance now is %d,overDraft now is %d\n", money, super.getBalance(), overDraft);
        }
    }

    @Override
    public void deposit(int money)
    {
        if (money < 0)
        {
            System.out.println("money < 0");
        } else
        {
            if (overDraft > 0)
            {
                int temp = overDraft - money;
                if (temp < 0)
                {
                    super.setBalance(super.getBalance() + temp);
                    System.out.printf("deposit %d complete,balance now is %d,overDraft now is %d\n", money, super.getBalance(), overDraft);
                }
            }
        }
    }
}
