package test3.account;

import java.time.LocalDateTime;

public class SavingAccount extends Account
{
    public SavingAccount()
    {
    }

    public SavingAccount(String accName, int balance, double annualIntRate, LocalDateTime accOpenDate)
    {
        super(accName, balance, annualIntRate, accOpenDate);
    }
}
