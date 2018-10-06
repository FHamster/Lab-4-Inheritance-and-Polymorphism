package test3;

import test3.account.Account;
import test3.account.CheckingAccount;
import test3.account.SavingAccount;

import java.time.LocalDateTime;

public class AccountDemo
{
    public static void main(String[] args)
    {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("AliceAccount", 1000, 0.2, LocalDateTime.now());
        accounts[1] = new CheckingAccount("AliceCheckingAccount", 1000, 0.2, LocalDateTime.now(), 1000, 0);
        accounts[2] = new SavingAccount("AliceSavingAccount", 1000, 0.2, LocalDateTime.now());
        for (Account x : accounts)
        {
            x.withdraw(1000);
        }
        for (Account x : accounts)
        {
            x.withdraw(1000);
        }
    }
}
