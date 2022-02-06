package za.ac.cput;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Rusty Mabiala (219197229)
 *
 * this is one class of the banking App
 * i will use for the testing purpose.
 */

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private String accountType;
    private double balance;

    //getters

    //testing the Disabling
    public static long getAccountNumber()
    {
        return 1234567890;
    }
    public String getAccountHolder()
    {
        return accountHolder;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public double getBalance()
    {
        return balance;
    }
    //setters
    public void setAccountNumber(long aN)
    {
        this.accountNumber = aN;
    }
    public void setAccountHolder(String aH)
    {
        this.accountHolder = aH;
    }
    public void setAccountType(String aT)
    {
        this.accountType = aT;
    }
    public void setbalance(double b)
    {
        this.balance = b;
    }
    //deposit
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("deposit R"+ amount + " into your account");
    }


    //for testing the ObjectIdentity
    public static int Identical(){
        int num1 = 14;
        int num2 = 10;
        return num1 = num2;
    }

    //for the test of failing
    public static double Multiply() {
        double raise_amount = 5;

        return raise_amount * 2;
    }

    //for testing the timeouts
    static void delaySecond(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //toString
    public String toString()
    {
        return("Account Number: " + getAccountNumber()+
                "\nAccount Holder: " + getAccountHolder()+
                "\nAccount Type: " + getAccountType()+
                "\nBalance: R"+ getBalance());
    }
}
